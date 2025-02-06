package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.nio.charset.StandardCharsets;

public class GeneratedTextNodeIsBlank {

    @Test
    public void textNodeIsBlank() {
        String text = "   ";
        TextNode textNode = new TextNode(text);
        assertTrue(textNode.isBlank());
    }

}