package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedOuterHtmlForElementWithTextIncludesText {

    @Test
    public void outerHtmlForElementWithTextIncludesText() {
        Element element = new Element("some data");
        Document document = Document.valueOf(element);
        element = document.body().children().first();
        element.outerHtmlHead(new StringBuilder(), 0, out);
    }

}