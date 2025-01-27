package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.concurrent.Callable;

public class GeneratedIsBlank {

    private Document documentBuilder = new Document();

    @Test
    public void isBlank() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

}