package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestAppend {

    @Test
    public void testAppend() {
        MockText mockText = new MockText();
        mockText.append("Hello");
        assert mockText.text.data.equals("Hello");
        mockText.clear();
        assertEquals("", mockText.text.toString());
    }

}