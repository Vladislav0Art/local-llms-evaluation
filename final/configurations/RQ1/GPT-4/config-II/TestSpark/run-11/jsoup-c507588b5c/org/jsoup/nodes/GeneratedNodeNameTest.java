package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        TextNode node = new TextNode("Test");
        assertEquals("#text", node.nodeName());
    }

}