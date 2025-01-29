package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedCreateFromEncoded_test {

    @Test
    public void createFromEncoded_test() {
        String encodedText = Mockito.mock(String.class);
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals("This is a test.", node.text());
    }

}