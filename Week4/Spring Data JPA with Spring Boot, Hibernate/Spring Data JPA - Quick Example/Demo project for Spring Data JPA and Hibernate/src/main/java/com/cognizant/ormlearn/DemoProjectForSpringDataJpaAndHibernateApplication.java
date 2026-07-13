package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class DemoProjectForSpringDataJpaAndHibernateApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoProjectForSpringDataJpaAndHibernateApplication.class);

    private static CountryService countryService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoProjectForSpringDataJpaAndHibernateApplication.class, args);

        countryService = context.getBean(CountryService.class);

        LOGGER.info("Inside main");

        testGetAllCountries();
    }

    private static void testGetAllCountries() {

        LOGGER.info("Start");

        List<Country> countries =
                countryService.getAllCountries();

        LOGGER.debug("countries={}", countries);

        LOGGER.info("End");
    }

}
