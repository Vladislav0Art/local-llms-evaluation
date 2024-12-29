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

import javax.annotation.Nullable;

public class GeneratedCreateElement_[EmptyTagName]

Test {

    @Test
    public void createElement_[ EmptyTagName]Test() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        Element element = document.createElement("");
        assertNotNull(element);
        assertTrue(element.tagName().equals(""));
    }

}