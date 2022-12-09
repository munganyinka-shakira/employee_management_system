package com.spring;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
public class MockitoDemoApplicationTests {
    @Autowired
    private BooksService booksService;

    @Autowired
    private BooksService booksService;

    @Test
    public void whenUserIdIsProvided_thenRetrievedNameIsCorrect() {
        Mockito.when(booksService.getBooksById()).thenReturn("Mock Book Id");
        String testName = BooksService.getBooksById();
        Assert.assertEquals("Mock Book Id", testName);
    }
}