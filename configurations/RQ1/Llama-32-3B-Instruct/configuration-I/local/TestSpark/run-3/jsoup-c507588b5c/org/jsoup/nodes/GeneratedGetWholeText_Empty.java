package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetWholeText_Empty {

    @Test
    public void getWholeText_Empty() {
        TextNode node = new TextNode("");
        assertEquals("", node.getWholeText());
    }

}