package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedCreateTextNodeFromEncoded_GivenEncodedText_ReturnsTextNode {

    @Test
    public void createTextNodeFromEncoded_GivenEncodedText_ReturnsTextNode() throws IOException {
        String encodedText = "text";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals(encodedText, textNode.text());
    }

}