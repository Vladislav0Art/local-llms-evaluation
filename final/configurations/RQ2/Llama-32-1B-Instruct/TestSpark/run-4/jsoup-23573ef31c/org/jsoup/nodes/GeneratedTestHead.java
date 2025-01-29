package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import static org.mockito.Mockito.*;

public class GeneratedTestHead {

    private Document document = new Document("");

    @Test
    public void testHead() {
        Element head = new DocumentElement("head");
        Elements result = document.head();
        assertTrue(result.contains(head));
        verify(head).createElement("head");
    }

}