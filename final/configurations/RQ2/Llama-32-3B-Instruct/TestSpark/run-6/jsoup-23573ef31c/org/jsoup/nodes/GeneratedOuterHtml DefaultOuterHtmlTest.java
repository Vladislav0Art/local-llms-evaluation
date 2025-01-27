package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedOuterHtml DefaultOuterHtmlTest {

    @Test
    public void outerHtml

    DefaultOuterHtmlTest() {
        Document document = new Document("http://example.com");
        String defaultOuterHtml = document.outerHtml();
        assertTrue(defaultOuterHtml.contains("<!DOCTYPE html>"));
    }

}