package com.skill.config;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class MyFastGeneratorConfiguration {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/job? serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8&useSSL=true"
                , "root", "123456")
                .globalConfig(builder -> {
                    builder.author("张蕾") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("D://IdeaProjiect//file"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.skill") // 设置父包名
                            .moduleName("sys") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "D://IdeaProjiect//file")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("jobs") // 设置需要生成的表名
                    //.addTablePrefix("act_fo_")
                    ; // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
