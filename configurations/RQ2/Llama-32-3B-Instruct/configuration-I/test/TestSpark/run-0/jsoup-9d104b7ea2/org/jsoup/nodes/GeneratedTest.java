package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedTest {

    private Appendable target;

    @Before
    public void setup() {
        target = new StringBuilder();
    }

    @Test
    public void append_WritesStringToAppendableWhenTargetIsEmpty() {
        target.append("Hello, World!");
        Assert.assertTrue(target instanceof String);
    }

    @Test
    public void appendAll_WritesStringArrayToAppendableWhenTargetIsEmpty() {
        char[] array = "Hello, World!".toCharArray();
        target.appendAll(array);
        Assert.assertTrue(target instanceof String);
    }
}

public class AppendWithEmptyTargetAndTrimmingTest {
    private Appendable target;

    @Before
    public void setup() {
        target = new StringBuilder();
    }

    @Test
    public void append_WritesStringToAppendableWhenTargetIsNotEmpty() {
        target.append("Hello, World!");
        Assert.assertTrue(target.toString().equals("Hello, World!"));
    }

    @Test
    public void appendAll_WritesStringArrayToAppendableWhenTargetIsNotEmpty() {
        char[] array = "Hello, World!".toCharArray();
        target.appendAll(array);
        Assert.assertTrue(target.toString().equals("Hello, World!"));
    }
}

public class AppendTests {
    private Appendable target;

    @Before
    public void setup() {
        target = new StringBuilder();
    }

    @Test
    public void append_WritesStringToAppendable() {
        target.append("Hello, World!");
        Assert.assertEquals(target.toString(), "Hello, World!");
    }

    @Test
    public void appendAll_WritesStringArrayToAppendable() {
        char[] array = "Hello, World!".toCharArray();
        target.appendAll(array);
        Assert.assertEquals(target.toString(), "Hello, World!");
    }

}