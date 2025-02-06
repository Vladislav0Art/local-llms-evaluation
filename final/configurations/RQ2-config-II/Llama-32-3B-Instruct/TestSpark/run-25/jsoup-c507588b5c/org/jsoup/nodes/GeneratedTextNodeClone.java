package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.nio.charset.StandardCharsets;

public class GeneratedTextNodeClone {

    @Test
    public void textNodeClone() {
        String text = "Hello World";
        TextNode originalTextNode = new TextNode(text);
        TextNode clonedTextNode = originalTextNode.clone();
        assertEquals(originalTextNode, clonedTextNode);
    }

}