package com.spring;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Profile("test")
@Configuration
public class BooksServiceTestConfiguration {
    @Bean
    @Primary
    public BooksService booksService() {
        return Mockito.mock(BooksService.class);
    }
}
