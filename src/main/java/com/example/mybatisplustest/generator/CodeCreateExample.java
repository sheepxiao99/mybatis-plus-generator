package com.example.mybatisplustest.generator;


import com.example.mybatisplustest.generator.model.GenInfo;

/**
 * 生成代码示例
 *
 * @author: LEIYU
 */
public class CodeCreateExample {

    public static void main(String[] args) {
        GenInfo.build()
                .setAuthor("YLJUN")
                //设置模块路径 F:\idea_workplace\bishe
                .setProjectPath("E:\\IdeaProjects_03\\mybatis-plus-test")
                //设置controller包名
                .setControllerPackageName("com.yljun.bishe.user.rest.controller")
                //设置service包名
                .setServicePackageName("com.yljun.bishe.user.rest.service")
                //设置dao包名
                .setEntityPackageName("com.yljun.bishe.user.rest.model.pojo")
                .setMapperPackageName("com.yljun.bishe.user.rest.dao.mapper")
                .setXmlPackageName("com.yljun.bishe.user.rest.dao.mapping")
                //设置是否生成controller
                .setGenController(true)
                //设置是否生成service
                .setGenService(true)
                //设置是否覆盖已存在文件
                .setOverrideExistFile(false)
                //生成
                .over();
    }

}
