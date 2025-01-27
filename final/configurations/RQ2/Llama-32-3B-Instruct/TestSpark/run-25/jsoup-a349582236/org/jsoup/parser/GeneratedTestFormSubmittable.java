package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

public class GeneratedTestFormSubmittable {

    @Test
    public void testFormSubmittable() throws Exception {
        Document document = Jsoup.parse("<form><tag>text</tag></form>");
        Element tagElement = document.selectFirst("tag");
        TestTag tag = new TestTag(tagElement.tagName(), false, true);
        assert !tag.isFormSubmittable();
    }

}