package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTextUpdateTest {

    @Test
    public void textUpdateTest() {
        TextNode node = new TextNode("Test Text");
        node.text("Updated Text");
        assertEquals("Updated Text", node.text());
    }

}