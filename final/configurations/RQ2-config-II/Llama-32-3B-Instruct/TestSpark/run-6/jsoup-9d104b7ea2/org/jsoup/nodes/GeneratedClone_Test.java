package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedClone_Test {

    @Test
    public void clone_Test() throws IOException {
        String text = "test";
        TextNode node = new TextNode(text);
        TextNode cloned = node.clone();
        assertNotNull(cloned);
    }

}