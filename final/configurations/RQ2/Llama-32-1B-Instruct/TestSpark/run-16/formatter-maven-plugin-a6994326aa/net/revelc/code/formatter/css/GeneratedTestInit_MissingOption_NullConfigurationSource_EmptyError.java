package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTestInit_MissingOption_NullConfigurationSource_EmptyError {

    @Test
    public void testInit_MissingOption_NullConfigurationSource_EmptyError() throws IOException {
        Process process = Runtime.getRuntime().exec("java -cp ../lib/* /dev/stdin Target");
        Assert.assertEquals(-1, process.exitValue());
    }

}