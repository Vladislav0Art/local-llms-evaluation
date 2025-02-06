package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedIsBlank_NonBlank_Test {

    @Test
    public void isBlank_NonBlank_Test() {
        String text = "test";
        TextNode node = new TextNode(text);
        assertFalse(node.isBlank());
    }

}