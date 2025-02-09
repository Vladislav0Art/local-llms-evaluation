package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.Jsoup;

public class GeneratedExpectForm_ReturnsCorrectFormElement {

    @Test
    public void expectForm_ReturnsCorrectFormElement() {
        Connection connection = Jsoup.connect("https://www.example.com/form");
        Document document = new Document(connection.url());
        FormElement form = document.expectForm("form");
        assertEquals(document, form);
    }

}