package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;

public class GeneratedExpectFormReturnsExpectedForm {

    @Test
    public void expectFormReturnsExpectedForm() {
        String cssQuery = "form";
        FormElement form = new FormElement();
        Document document = Document.createShell("https://example.com");
        FormElement expectedForm = document.expectForm(cssQuery);
        assertEquals(form, expectedForm);
    }

}