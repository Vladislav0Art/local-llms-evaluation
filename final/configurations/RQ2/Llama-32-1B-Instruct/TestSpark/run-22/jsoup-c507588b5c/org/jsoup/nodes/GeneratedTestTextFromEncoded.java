package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.verify;

public class GeneratedTestTextFromEncoded {

    @Test
    public void testTextFromEncoded() throws Exception {
        String encodedText = "Hello";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals(String.class, node.getText().getClass());
    }

}