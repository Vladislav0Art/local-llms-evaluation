package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTestDoFormat_EmptyCode {

    @Test
    public void testDoFormat_EmptyCode() throws IOException {
        Process process = Runtime.getRuntime().exec("java -cp ../lib/* TestClass.java");
        Assert.assertEquals(0, process.exitValue());
    }

}