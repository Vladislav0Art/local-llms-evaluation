package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.verify;

public class GeneratedTest textFromEncoded {

    @Test
    public void test

    textFromEncoded() throws Exception {
        String encodedText = "Hello";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals("Hello", node.text().toString());
    }

}