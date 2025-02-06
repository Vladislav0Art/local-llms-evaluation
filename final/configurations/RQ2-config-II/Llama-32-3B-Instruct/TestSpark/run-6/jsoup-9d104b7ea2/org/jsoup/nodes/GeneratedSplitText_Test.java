package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSplitText_Test {

    @Test
    public void splitText_Test() throws IOException {
        String text = "test";
        TextNode node = new TextNode(text);
        TextNode split = node.splitText(1);
        assertNotNull(split);
    }

}