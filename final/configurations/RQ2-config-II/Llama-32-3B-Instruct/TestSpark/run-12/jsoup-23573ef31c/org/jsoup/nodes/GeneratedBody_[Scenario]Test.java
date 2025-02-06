package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedBody_[Scenario]

Test {

    @Test
    public void body_[ Scenario]Test() {
        String html = "<html><body>Hello World!</body></html>";
        Document document = Document.parse(html);
        assertNotNull(document.body());
    }

}