package com.cbcb.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author 晨边#CB
 * @Date:created in  2019/11/19 15:56
 * @Version V1.0
 **/
@Configuration
public class MyBatisMapperScannerConfig {

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");

        //com.cbcb.dal.mapper 这个包是所有Mapper.java文件所在路径，该包下面的子包里面的文件同样会扫描到
        //此包名与具体应用相关
        mapperScannerConfigurer.setBasePackage("com.cbcb.sqlite.Mapper");

        return mapperScannerConfigurer;
    }
}
