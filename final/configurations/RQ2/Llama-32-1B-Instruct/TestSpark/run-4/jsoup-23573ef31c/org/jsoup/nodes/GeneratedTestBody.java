package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import static org.mockito.Mockito.*;

public class GeneratedTestBody {

    private Document document = new Document("");

    @Test
    public void testBody() {
        Element body = new DocumentElement("body");
        Elements result = document.body();
        assertTrue(result.contains(body));
        verify(body).createElement("body");
    }

}