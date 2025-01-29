package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTestInit_MissingOption_NullConfigurationSource_EmptyOptions_NoError {

    @Test
    public void testInit_MissingOption_NullConfigurationSource_EmptyOptions_NoError() throws IOException {
        Process process = Runtime.getRuntime().exec("java -cp ../lib/* Target");
        Assert.assertEquals(0, process.exitValue());
    }

}