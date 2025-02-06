package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.nio.charset.StandardCharsets;

public class GeneratedTextNodeToString {

    @Test
    public void textNodeToString() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        String expectedString = "<span class=\"text\">Hello World</span>";
        assertEquals(expectedString, textNode.toString());
    }

}