package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestExpectFormElements {

    @Test
    public void testExpectFormElements() {
        Document document = new Document("https://example.com");
        FormElement form1 = document.expectForm(".my-class");
        assertNotNull(form1);
    }

}