package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;

public class GeneratedTextNotEmptyStringTest {

    @Test
    public void textNotEmptyStringTest() {
        TextNode node = new TextNode("Hello");
        assertEquals("Hello", node.text());
    }

}