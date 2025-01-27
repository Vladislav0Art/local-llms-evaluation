package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class GeneratedExpectFormBasicTest {

    @Test
    public void expectFormBasicTest() {
        Document document = new Document("http://example.com");
        FormElement formElement = document.expectForm("*");
        org.junit.Assert.assertNotNull(formElement);
    }

}