package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedLocation_[Scenario]

Test {

    @Test
    public void location_[ Scenario]Test() {
        String html = "<html><body>Hello World!</body></html>";
        Document document = Document.parse(html);
        assertEquals("https://example.com", document.location());
    }

}