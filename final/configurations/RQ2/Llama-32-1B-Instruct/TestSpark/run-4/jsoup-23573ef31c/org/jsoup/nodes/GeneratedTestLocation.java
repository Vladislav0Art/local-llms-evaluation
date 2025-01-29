package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import static org.mockito.Mockito.*;

public class GeneratedTestLocation {

    private Document document = new Document("");

    @Test
    public void testLocation() {
        when(document.location()).thenReturn("https://www.example.com");
        String result = document.location();
        assertEquals("https://www.example.com", result);
    }

}