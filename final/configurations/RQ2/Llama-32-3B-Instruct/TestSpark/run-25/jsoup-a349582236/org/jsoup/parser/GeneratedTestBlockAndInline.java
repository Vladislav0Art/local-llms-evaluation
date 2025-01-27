package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

public class GeneratedTestBlockAndInline {

    @Test
    public void testBlockAndInline() throws Exception {
        Document document = Jsoup.parse("<div><p><tag>text</tag></p></div>");
        Element tagElement = document.selectFirst("tag");
        TestTag tag = new TestTag(tagElement.tagName(), true, false);
        assert !tag.isInline();
    }

}