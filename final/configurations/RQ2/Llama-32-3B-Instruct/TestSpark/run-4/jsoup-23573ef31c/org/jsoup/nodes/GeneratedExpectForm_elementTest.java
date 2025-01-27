package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.List;

public class GeneratedExpectForm_elementTest {

    @Test
    public void expectForm_elementTest() {
        Document document = new Document("https://example.com");
        String cssQuery = "div";
        FormElement form = document.expectForm(cssQuery);
        assertNotNull(form);
    }

}