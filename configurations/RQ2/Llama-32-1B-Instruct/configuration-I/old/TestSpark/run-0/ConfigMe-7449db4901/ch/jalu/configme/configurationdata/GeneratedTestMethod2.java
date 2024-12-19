package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.lang.reflect.Method;

public class GeneratedTestMethod2 {

    @Test
    public void testMethod2() {
        // Arrange
        String actualComments = "This is actual comment";

        // Act
        Class<?> clazz = Generated.class;
        Method method = clazz.getMethod("getComments");
        Object comments = method.invoke(null);

        // Assert
        assertEquals(actualComments, (String) comments.toString());
    }

}