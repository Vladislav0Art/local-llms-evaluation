package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedGetWholeText_Test {

    @Test
    public void getWholeText_Test() {
        TextNode node = new TextNode("test");
        assertEquals("test", node.getWholeText());
    }

}