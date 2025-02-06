package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedGetWholeText_Test {

    @Test
    public void getWholeText_Test() {
        String text = "test";
        TextNode node = new TextNode(text);
        assertEquals(text, node.getWholeText());
    }

}