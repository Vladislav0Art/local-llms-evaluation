package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestTextSplitTextAtOffset2 {

    @Test
    public void testTextSplitTextAtOffset2() {
        assertEquals("Hello", TextNode.class.getMethod("splitText").invoke(new TextNode("Hello World  ")));
    }

}