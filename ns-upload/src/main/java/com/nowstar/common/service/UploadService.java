package com.nowstar.common.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author yinminxin
 * @description 上传Service
 * @date 2020/5/22 15:17
 */
public interface UploadService {

    public String upload(MultipartFile file);
}
