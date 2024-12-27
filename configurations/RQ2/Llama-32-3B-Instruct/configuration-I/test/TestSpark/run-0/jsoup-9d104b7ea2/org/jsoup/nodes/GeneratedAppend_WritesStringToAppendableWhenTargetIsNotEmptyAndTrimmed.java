package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedAppend_WritesStringToAppendableWhenTargetIsNotEmptyAndTrimmed {

    private Appendable target;

    @Before
    public void setup() {
        target = new StringBuilder();
    }

    @Test
    public void append_WritesStringToAppendableWhenTargetIsNotEmptyAndTrimmed() {
        target.append("Hello, World!");
        assertTrue(target.toString().equals("Hello, World"));
    }

}