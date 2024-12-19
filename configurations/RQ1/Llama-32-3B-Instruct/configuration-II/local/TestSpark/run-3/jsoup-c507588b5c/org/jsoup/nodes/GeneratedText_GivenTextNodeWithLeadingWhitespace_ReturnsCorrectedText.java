package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedText_GivenTextNodeWithLeadingWhitespace_ReturnsCorrectedText {

    private final TextNode node1 = new TextNode("Hello World");
    private final TextNode node2 = new TextNode("");
    private final TextNode node3 = new TextNode("\n\n");

    @Test
    public void text_GivenTextNodeWithLeadingWhitespace_ReturnsCorrectedText() {
        String correctedText = StringUtil.normaliseWhitespace(node3.text());
        assertEquals("\n\n", correctedText);
    }

}