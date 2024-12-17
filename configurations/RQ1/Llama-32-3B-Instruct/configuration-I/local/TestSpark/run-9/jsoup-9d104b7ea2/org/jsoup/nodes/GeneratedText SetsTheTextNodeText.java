package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedText SetsTheTextNodeText {

    @Mock
    private LeafNode parentNode;

    @Mock
    private Element parentElement;

    public static String normaliseWhitespace(String text) {
        // implementation remains the same as in the source code
    }

    public static String stripLeadingWhitespace(String text) {
        // implementation remains the same as in the source code
    }

    public static boolean lastCharIsWhitespace(StringBuilder sb) {
        // implementation remains the same as in the source code
    }

    @Test
    public void text

    SetsTheTextNodeText() {
        TextNode textNode = new TextNode();
        textNode.text("Hello World");
        assertEquals("Hello World", textNode.text());
    }

}