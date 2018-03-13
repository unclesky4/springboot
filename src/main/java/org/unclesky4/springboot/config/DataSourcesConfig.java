package org.unclesky4.springboot.config;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * 数据源设置
 * @author unclesky4
 *
 */
@Configuration
@PropertySource("classpath:application.properties")
public class DataSourcesConfig {
	
	@Value("${spring.datasource.url}")
	String url;
	
	@Value("${spring.datasource.driverClassName}")
	String driver;
	
	@Value("${spring.datasource.username}")
	String username;
	
	@Value("${spring.datasource.password}")
	String password;
	
	@Value("${spring.datasource.initialSize}")
	int initSize;
	
	@Value("${spring.datasource.maxActive}")
	int maxActive;
	
	@Value("${spring.datasource.minIdle}")
	int maxIdle;
	
	@Value("${spring.datasource.maxWait}")
	int maxWait;
	

    @Primary //默认数据源
    @Bean(name = "dataSource",destroyMethod = "close")
    public DruidDataSource Construction() throws SQLException {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/springboot?useUnicode=true&amp;characterEncoding=utf8&amp;useSSL=false");
        dataSource.setUsername("uncle");
        dataSource.setPassword("uncle");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        //配置最大连接
        dataSource.setMaxActive(maxActive);
        //配置初始连接
        dataSource.setInitialSize(initSize);
        //配置最小连接
        dataSource.setMinIdle(maxIdle);
        //连接等待超时时间
        dataSource.setMaxWait(maxWait);
        //间隔多久进行检测,关闭空闲连接
        dataSource.setTimeBetweenEvictionRunsMillis(60000);
        //一个连接最小生存时间
        dataSource.setMinEvictableIdleTimeMillis(300000);
        //用来检测是否有效的sql
        dataSource.setValidationQuery("select 'x'");
        dataSource.setTestWhileIdle(true);
        dataSource.setTestOnBorrow(false);
        dataSource.setTestOnReturn(false);
        //打开PSCache,并指定每个连接的PSCache大小
        dataSource.setPoolPreparedStatements(true);
        dataSource.setMaxOpenPreparedStatements(20);
        //配置sql监控的filter
        dataSource.setFilters("stat,wall,log4j");
        try {
            dataSource.init();
        } catch (SQLException e) {
            throw new RuntimeException("druid datasource init fail");
        }
        return dataSource;
    }
}
