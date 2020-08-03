package com.nowstar.common.service.impl;

import com.github.tobato.fastdfs.domain.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import com.nowstar.common.controller.UploadController;
import com.nowstar.common.service.UploadService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.util.Arrays;
import java.util.List;

/**
 * @author yinminxin
 * @description 上传业务层
 * @date 2020/5/22 15:17
 */
@Service
public class UploadServiceImpl implements UploadService {

    private static final Logger logger = LoggerFactory.getLogger(UploadController.class);

    // 支持的文件类型
    private static final List<String> suffixes = Arrays.asList("image/png", "image/jpeg", "image/jpg");

    @Autowired
    FastFileStorageClient storageClient;

    public String upload(MultipartFile file) {
        try {
            // 1、图片信息校验
            // 1)校验文件类型
            String type = file.getContentType();
            if (!suffixes.contains(type)) {
                logger.info("上传失败，文件类型不匹配：{}", type);
                return null;
            }
            // 2)校验图片内容
            BufferedImage image = ImageIO.read(file.getInputStream());
            if (image == null) {
                logger.info("上传失败，文件内容不符合要求");
                return null;
            }
            // 2、将图片上传到FastDFS
            // 2.1、获取文件后缀名
            String extension = StringUtils.substringAfterLast(file.getOriginalFilename(), ".");
            // 2.2、上传
            StorePath storePath = this.storageClient.uploadFile(
                    file.getInputStream(), file.getSize(), extension, null);
            // 2.3、返回完整路径
            return "http://www.yzrr.xyz/" + storePath.getFullPath();
            // 2、保存图片
//            // 2.1、生成保存目录
//            File dir = new File("E:\\yinminxin\\uploadResources");
//            if (!dir.exists()) {
//                dir.mkdirs();
//            }
//            // 2.2、保存图片
//            file.transferTo(new File(dir, file.getOriginalFilename()));
//
//            // 2.3、拼接图片地址
//            String url = "http://127.0.0.1/upload/" + file.getOriginalFilename();
//
//            return url;
        } catch (Exception e) {
            return null;
        }
    }
}
