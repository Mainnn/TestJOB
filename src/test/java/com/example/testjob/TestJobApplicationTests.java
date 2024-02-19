package com.example.testjob;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@SpringBootTest
class TestJobApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("PIZDA");
    }
    @Test
    public void testJenkinsJob() {
        // Проверяем, что сборка завершилась успешно
        boolean buildSuccessful = true; // Здесь нужно проверить реальный статус сборки в Jenkins
        assertTrue("Сборка завершилась с ошибкой", buildSuccessful);
    }
    @Test
    public void testJenkinsJobTOw() {
        // Проверяем, что сборка завершилась успешно
        boolean buildSuccessful = false; // Здесь нужно проверить реальный статус сборки в Jenkins
        assertFalse("Сборка завершилась с ошибкой", buildSuccessful);
    }

}
