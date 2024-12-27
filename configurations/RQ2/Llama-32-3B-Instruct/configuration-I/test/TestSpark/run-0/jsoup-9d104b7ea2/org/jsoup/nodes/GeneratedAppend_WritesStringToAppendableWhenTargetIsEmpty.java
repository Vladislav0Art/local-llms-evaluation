package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedAppend_WritesStringToAppendableWhenTargetIsEmpty {

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

}