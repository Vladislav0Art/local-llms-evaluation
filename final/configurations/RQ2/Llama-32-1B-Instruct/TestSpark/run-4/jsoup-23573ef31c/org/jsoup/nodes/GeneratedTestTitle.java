package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import static org.mockito.Mockito.*;

public class GeneratedTestTitle {

    private Document document = new Document("");

    @Test
    public void testTitle() {
        String title = "My Title";
        document.title(title);
        assertEquals(title, document.title());
    }

}