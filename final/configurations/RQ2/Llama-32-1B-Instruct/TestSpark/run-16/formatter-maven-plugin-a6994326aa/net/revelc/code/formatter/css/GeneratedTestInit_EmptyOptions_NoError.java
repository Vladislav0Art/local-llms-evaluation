package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTestInit_EmptyOptions_NoError {

    @Test
    public void testInit_EmptyOptions_NoError() throws IOException {
        // Arrange
        String input = "";

        // Act
        Process process = Runtime.getRuntime().exec("java -cp ../lib/* Target");
        process.waitFor();

        // Assert
        Assert.assertEquals(0, process.exitValue());
    }

}