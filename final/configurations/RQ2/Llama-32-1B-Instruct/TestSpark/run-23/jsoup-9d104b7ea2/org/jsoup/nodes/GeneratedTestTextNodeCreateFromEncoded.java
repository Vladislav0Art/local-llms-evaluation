package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestTextNodeCreateFromEncoded {

    @Test
    public void testTextNodeCreateFromEncoded() {
        String encodedText = "Hello World";
        TestTextNodeCreateFromEncoded createFromEncoded = new TestTextNodeCreateFromEncoded(encodedText);
        TestTextNode textNode = createFromEncoded.create();
        assertEquals("Hello World", textNode.text());
    }

}