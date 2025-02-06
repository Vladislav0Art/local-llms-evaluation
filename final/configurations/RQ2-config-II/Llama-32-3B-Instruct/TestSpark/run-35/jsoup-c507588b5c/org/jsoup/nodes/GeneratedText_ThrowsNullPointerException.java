package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedText_ThrowsNullPointerException {

    @Test
    public void text_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> ((LeafNode) Mockito.mock(TextNode.class)).text());
    }

}