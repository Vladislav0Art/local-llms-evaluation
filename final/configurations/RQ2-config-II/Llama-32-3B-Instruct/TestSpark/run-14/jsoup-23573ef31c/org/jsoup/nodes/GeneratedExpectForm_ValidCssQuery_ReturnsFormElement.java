package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.select.Elements;

public class GeneratedExpectForm_ValidCssQuery_ReturnsFormElement {

    @Test
    public void expectForm_ValidCssQuery_ReturnsFormElement() {
        String cssQuery = "form";
        Document document = Document.createShell("");
        FormElement form = document.expectForm(cssQuery);
        assertNotNull(form);
        assertTrue(Validate.isInstanceOf(form, Element.class));
    }

}