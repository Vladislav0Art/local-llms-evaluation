package org.jsoup.nodes;

import org.junit.Test;
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

public class GeneratedBodyElement_ReturnsCorrectBodyElement {

    @Test
    public void bodyElement_ReturnsCorrectBodyElement() {
        Document document = Document.createShell("http://example.com");
        Element body = document.body();
        assertTrue(body != null);
    }

}