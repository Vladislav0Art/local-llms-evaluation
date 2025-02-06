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
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.List;

public class GeneratedText[]

Test {

    @Test
    public void text[] Test() {
        String html = "<p>Hello World!</p>";
        Document doc = Jsoup.parse(html).getDocument();
        Element element = doc.text("Hello");
        assertNotNull(element);
        assertEquals("<p>Hello World!</p>", element.outerHtml());
    }

}