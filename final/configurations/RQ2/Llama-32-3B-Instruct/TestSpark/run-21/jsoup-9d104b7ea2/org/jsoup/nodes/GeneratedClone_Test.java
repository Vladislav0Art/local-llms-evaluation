package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedClone_Test {

    @Test
    public void clone_Test() {
        TextNode node = new TextNode("test");
        TextNode cloned = node.clone();
        assertNotNull(cloned);
    }

}