package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedCreateFromEncoded_emptyStringTest {

    @Test
    public void createFromEncoded_emptyStringTest() {
        String encodedText = "";
        TextNode textNode = new TextNode(encodedText);
        assertNotNull(textNode);
    }

}