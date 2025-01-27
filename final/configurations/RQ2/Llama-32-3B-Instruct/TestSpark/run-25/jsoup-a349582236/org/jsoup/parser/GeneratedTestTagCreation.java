package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

public class GeneratedTestTagCreation {

    @Test
    public void testTagCreation() throws Exception {
        Document document = Jsoup.parse("<tag>text</tag>");
        Element tagElement = document.selectFirst("tag");
        TestTag tag = new TestTag(tagElement.tagName());
        assert tag.getName().equals(tagElement.tagName());
    }

}