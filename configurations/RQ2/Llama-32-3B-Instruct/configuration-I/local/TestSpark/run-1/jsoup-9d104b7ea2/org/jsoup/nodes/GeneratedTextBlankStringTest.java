package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;

public class GeneratedTextBlankStringTest {

    @Test
    public void textBlankStringTest() {
        TextNode node = new TextNode("");
        assertEquals("", node.text());
    }

}