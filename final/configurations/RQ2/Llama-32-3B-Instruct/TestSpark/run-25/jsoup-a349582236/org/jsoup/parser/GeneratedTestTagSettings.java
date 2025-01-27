package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

public class GeneratedTestTagSettings {

    @Test
    public void testTagSettings() throws Exception {
        Document document = Jsoup.parse("<tag>text</tag>");
        Element tagElement = document.selectFirst("tag");
        TestTag tag = new TestTag(tagElement.tagName(), false, true);
        assert !tag.isSelfClosing();
    }

}