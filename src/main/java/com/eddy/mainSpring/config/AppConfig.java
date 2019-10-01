package com.eddy.mainSpring.config;


import com.eddy.mainSpring.repository.WareHouseRepositories;
import com.eddy.mainSpring.services.WareHouseService;
import com.eddy.mainSpring.services.impl.WareHouseServiceImpl;
import com.eddy.mainSpring.services.repository.WareHoseRepImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    @Primary
    public WareHouseService createWarehouseService(WareHouseRepositories repositories) {
        return new WareHouseServiceImpl(repositories);
    }


    //This is a comment
    //TODO: this is todo
    @Bean

    public WareHouseRepositories createWareHouseRep() {
        return new WareHoseRepImpl();
    }


}
