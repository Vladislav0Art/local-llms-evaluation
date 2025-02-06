package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.Connection;
import org.jsoup.nodes.Document;

public class GeneratedOuterHtmlShouldNotBeEmptyString {

    @Test
    public void outerHtmlShouldNotBeEmptyString() {
        Document document = new Document();
        assertNotEquals("", document.outerHtml());
    }

}