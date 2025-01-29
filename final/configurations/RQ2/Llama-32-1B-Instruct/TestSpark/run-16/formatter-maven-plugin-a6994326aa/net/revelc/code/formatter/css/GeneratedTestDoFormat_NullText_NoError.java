package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTestDoFormat_NullText_NoError {

    @Test
    public void testDoFormat_NullText_NoError() throws IOException {
        // Arrange
        String input = "";

        // Act
        Process process = Runtime.getRuntime().exec("java -cp ../lib/* TestSpark /dev/stdin");
        process.waitFor();

        // Assert
        Assert.assertEquals(0, process.exitValue());
    }

}