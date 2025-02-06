package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTitle_[Scenario]

Test {

    @Test
    public void title_[ Scenario]Test() {
        String html = "<html><head><title>Example</title></head><body>Hello World!</body></html>";
        Document document = Document.parse(html);
        assertEquals("Example", document.title());
    }

}