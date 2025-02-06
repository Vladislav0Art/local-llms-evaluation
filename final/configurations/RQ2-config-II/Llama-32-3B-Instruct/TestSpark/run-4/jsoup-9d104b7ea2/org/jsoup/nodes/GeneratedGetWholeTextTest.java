package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedGetWholeTextTest {

    @Test
    public void getWholeTextTest() throws IOException {
        TextNode node = new TextNode("Hello\nWorld");
        assertEquals("Hello\nWorld", node.getWholeText());
    }

}