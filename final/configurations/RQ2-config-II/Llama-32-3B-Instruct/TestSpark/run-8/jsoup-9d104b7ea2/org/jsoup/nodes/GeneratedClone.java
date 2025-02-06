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

public class GeneratedClone {

    @Test
    public void clone() {
        TextNode node = new TextNode("Hello World");
        TextNode clone = (TextNode) node.clone();
        assertEquals("Hello World", clone.text());
    }

}