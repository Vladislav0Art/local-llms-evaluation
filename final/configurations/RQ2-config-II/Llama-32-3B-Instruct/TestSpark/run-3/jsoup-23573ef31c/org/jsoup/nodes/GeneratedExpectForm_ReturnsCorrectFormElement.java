package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedExpectForm_ReturnsCorrectFormElement {

    @Test
    public void expectForm_ReturnsCorrectFormElement() {
        String cssQuery = "#form";
        String baseUri = "https://example.com";
        Document document = new Document(baseUri);
        FormElement form = document.expectForm(cssQuery);
        assertNotNull(form);
    }

}