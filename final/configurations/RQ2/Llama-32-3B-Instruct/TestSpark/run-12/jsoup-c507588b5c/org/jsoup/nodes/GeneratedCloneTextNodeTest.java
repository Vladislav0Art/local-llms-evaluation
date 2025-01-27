package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedCloneTextNodeTest {

    @Test
    public void cloneTextNodeTest() {
        String text = "Hello World";
        TextNode original = new TextNode(text);
        TextNode cloned = original.clone();
        assertTrue(original == cloned);
    }

}