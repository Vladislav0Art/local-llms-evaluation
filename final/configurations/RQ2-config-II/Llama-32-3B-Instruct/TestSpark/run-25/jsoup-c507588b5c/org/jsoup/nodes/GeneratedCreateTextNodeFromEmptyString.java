package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.nio.charset.StandardCharsets;

public class GeneratedCreateTextNodeFromEmptyString {

    @Test
    public void createTextNodeFromEmptyString() {
        String text = "";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode);
        assertEquals("", textNode.text());
    }

}