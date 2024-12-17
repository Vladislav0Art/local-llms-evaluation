package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestClearAndAppendAgain {

    @Test
    public void testClearAndAppendAgain() {
        MockText mockText = new MockText();
        mockText.append("Hello");
        assert mockText.text.data.equals("Hello");
        mockText.clear();
        assertEquals("Hello", mockText.text.toString());
    }

}