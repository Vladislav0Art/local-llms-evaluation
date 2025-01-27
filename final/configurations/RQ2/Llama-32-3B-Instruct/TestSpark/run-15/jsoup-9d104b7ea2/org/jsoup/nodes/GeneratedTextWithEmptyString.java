package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.concurrent.Callable;

public class GeneratedTextWithEmptyString {

    private Document documentBuilder = new Document();

    @Test
    public void textWithEmptyString() {
        TextNode node = new TextNode("");
        assertEquals("", node.text());
    }

}