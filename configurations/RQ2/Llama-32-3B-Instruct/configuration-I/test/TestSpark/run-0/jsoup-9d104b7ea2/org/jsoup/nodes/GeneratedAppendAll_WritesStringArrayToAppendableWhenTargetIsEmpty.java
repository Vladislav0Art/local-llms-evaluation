package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedAppendAll_WritesStringArrayToAppendableWhenTargetIsEmpty {

    private Appendable target;

    @Before
    public void setup() {
        target = new StringBuilder();
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

}