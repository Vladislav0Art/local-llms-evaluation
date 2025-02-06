package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedIsBlank {

    @Test
    public void isBlank() {
        TextNode node1 = new TextNode("");
        assertTrue(node1.isBlank());

        TextNode node2 = new TextNode("   ");
        assertTrue(node2.isBlank());

        TextNode node3 = new TextNode("Hello");
        assertFalse(node3.isBlank());
    }

}