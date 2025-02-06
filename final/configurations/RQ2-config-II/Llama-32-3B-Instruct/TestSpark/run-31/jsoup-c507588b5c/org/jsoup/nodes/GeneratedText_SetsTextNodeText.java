package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedText_SetsTextNodeText {

    @Test
    public void text_SetsTextNodeText() {
        TextNode textNode = new TextNode();
        textNode.text("Hello, World!");
        assertNotNull(textNode.text());
    }

}