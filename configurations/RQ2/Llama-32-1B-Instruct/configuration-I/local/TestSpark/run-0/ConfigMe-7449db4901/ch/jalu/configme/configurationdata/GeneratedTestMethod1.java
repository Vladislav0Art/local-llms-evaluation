package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.lang.reflect.Method;

public class GeneratedTestMethod1 {

    @Test
    public void testMethod1() {
        // Arrange
        String expectedComments = "This is expected comment";

        // Act
        Class<?> clazz = Generated.class;
        Method method = clazz.getMethod("getComments");
        Object comments = method.invoke(null);

        // Assert
        assertEquals(expectedComments, (String) comments.toString());
    }

}