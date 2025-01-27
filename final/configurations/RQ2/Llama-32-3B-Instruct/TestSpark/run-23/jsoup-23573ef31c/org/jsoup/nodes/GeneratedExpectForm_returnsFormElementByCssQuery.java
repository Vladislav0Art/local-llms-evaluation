package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GeneratedExpectForm_returnsFormElementByCssQuery {

    @Test
    public void expectForm_returnsFormElementByCssQuery() {
        Connection connection = Jsoup.connect("https://example.com/form");
        Document document = Document.createShell(connection.url());
        FormElement formElement = document.expectForm(".form-class");
        assertNotNull(formElement);
    }

}