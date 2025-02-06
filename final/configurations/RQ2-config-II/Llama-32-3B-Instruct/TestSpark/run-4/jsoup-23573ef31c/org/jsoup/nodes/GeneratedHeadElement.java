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

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.List;

public class GeneratedHeadElement {

    @Test
    public void headElement() {
        Document document = new Document("https://example.com");
        Element head = document.head();
        // assertions for the head element
    }

}