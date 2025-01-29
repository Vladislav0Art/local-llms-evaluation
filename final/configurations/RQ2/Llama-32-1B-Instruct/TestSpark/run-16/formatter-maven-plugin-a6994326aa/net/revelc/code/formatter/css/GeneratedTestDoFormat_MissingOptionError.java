package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTestDoFormat_MissingOptionError {

    @Test
    public void testDoFormat_MissingOptionError() throws IOException {
        Process process = Runtime.getRuntime().exec("java -cp '../lib' /dev/stderr TestClass.java");
        Assert.assertEquals(-1, process.exitValue());
    }

}