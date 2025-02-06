package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedForms_[Scenario]

Test {

    @Test
    public void forms_[ Scenario]Test() {
        String html = "<html><form></form><body>Hello World!</body></html>";
        Document document = Document.parse(html);
        assertNotNull(document.forms());
    }

}