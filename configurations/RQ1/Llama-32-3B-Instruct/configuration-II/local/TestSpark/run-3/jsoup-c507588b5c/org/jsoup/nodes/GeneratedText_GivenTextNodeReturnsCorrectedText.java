package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedText_GivenTextNodeReturnsCorrectedText {

    private final TextNode node1 = new TextNode("Hello World");
    private final TextNode node2 = new TextNode("");
    private final TextNode node3 = new TextNode("\n\n");

    @Test
    public void text_GivenTextNodeReturnsCorrectedText() {
        String correctedText = StringUtil.normaliseWhitespace(node1.text());
        assertEquals("Hello World", correctedText);
    }

}