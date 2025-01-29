package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void testInit_EmptyOptions() throws IOException {
        Process process = Runtime.getRuntime().exec("java -cp ../lib/* Target");
        Assert.assertEquals(0, process.exitValue());
    }

    @Test
    public void testInit_MissingOption_EmptyOptions_NoError() throws IOException {
        Process process = Runtime.getRuntime().exec("java -cp ../lib/* Target");
        Assert.assertEquals(0, process.exitValue());
    }

    @Test
    public void testInit_MissingOption_NullConfigurationSource_EmptyOptions_NoError() throws IOException {
        Process process = Runtime.getRuntime().exec("java -cp ../lib/* Target");
        Assert.assertEquals(0, process.exitValue());
    }

    @Test
    public void testInit_MissingOption_NullConfigurationSource_EmptyError() throws IOException {
        Process process = Runtime.getRuntime().exec("java -cp ../lib/* /dev/stdin Target");
        Assert.assertEquals(-1, process.exitValue());
    }

    @Test
    public void testDoFormat_EmptyCode() throws IOException {
        Process process = Runtime.getRuntime().exec("java -cp ../lib/* TestClass.java");
        Assert.assertEquals(0, process.exitValue());
    }

    @Test
    public void testDoFormat_MissingOption() throws IOException {
        Process process = Runtime.getRuntime().exec("java -cp '../lib' TestClass.java");
        Assert.assertEquals(-1, process.exitValue());
    }

    @Test
    public void testDoFormat_EmptyCodeError() throws IOException {
        Process process = Runtime.getRuntime().exec("java -cp '../lib' /dev/stdout TestClass.java");
        Assert.assertEquals(-1, process.exitValue());
    }

    @Test
    public void testDoFormat_MissingOptionError() throws IOException {
        Process process = Runtime.getRuntime().exec("java -cp '../lib' /dev/stderr TestClass.java");
        Assert.assertEquals(-1, process.exitValue());
    }

}