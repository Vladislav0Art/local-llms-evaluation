package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTestDoFormat_EmptyCodeError {

    @Test
    public void testDoFormat_EmptyCodeError() throws IOException {
        Process process = Runtime.getRuntime().exec("java -cp '../lib' /dev/stdout TestClass.java");
        Assert.assertEquals(-1, process.exitValue());
    }

}