package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedSetTextTest {

    @Test
    public void setTextTest() {
        TextNode node = new TextNode("Test");
        node.text("New Test");
        assertEquals("New Test", node.getWholeText());
    }

}