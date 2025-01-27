package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.concurrent.Callable;

public class GeneratedIsBlankNot {

    private Document documentBuilder = new Document();

    @Test
    public void isBlankNot() {
        TextNode node = new TextNode("Hello World");
        assertFalse(node.isBlank());
    }

}