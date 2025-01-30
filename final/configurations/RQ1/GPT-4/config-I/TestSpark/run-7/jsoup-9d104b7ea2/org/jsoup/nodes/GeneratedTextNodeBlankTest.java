package org.jsoup.nodes;

import org.jsoup.nodes.Document.OutputSettings;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedTextNodeBlankTest {

    @Test
    public void textNodeBlankTest() {
        TextNode node = new TextNode(" ");
        assertEquals(node.text(), " ");
        assertTrue(node.isBlank());
    }

}