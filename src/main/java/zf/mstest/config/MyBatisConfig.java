package zf.mstest.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * 配置Mapper接口扫描路径
 */
@Configuration
@MapperScan("zf.mstest.mapper")
public class MyBatisConfig {
    // 可在此添加分页插件等MyBatis全局配置
}