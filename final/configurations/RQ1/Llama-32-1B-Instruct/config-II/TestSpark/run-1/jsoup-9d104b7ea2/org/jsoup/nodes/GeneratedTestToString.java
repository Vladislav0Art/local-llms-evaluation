package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Random;

public class GeneratedTestToString {

    private TextNode node;

    @Before
    public void setup() {
        Random random = new Random();
        node = new TextNode(StringUtil.randomString(10, 100));
    }

    @Test
    public void testToString() {
        String text = "   Hello World!";
        node.setText(text);
        assertEquals("Hello World!", node.toString());
    }

    private Document createDocument() throws IOException {
        return new Document();
    }

}