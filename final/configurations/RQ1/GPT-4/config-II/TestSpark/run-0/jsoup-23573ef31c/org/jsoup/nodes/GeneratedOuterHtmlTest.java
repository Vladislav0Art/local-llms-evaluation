package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedOuterHtmlTest {

    @Test
    public void outerHtmlTest() {
        Document doc = new Document("http://example.com");

        Element html = doc.appendElement("html");
        html.appendElement("head");
        html.appendElement("body");

        assertTrue(doc.outerHtml().contains("<html>"));
        assertTrue(doc.outerHtml().contains("<head>"));
        assertTrue(doc.outerHtml().contains("<body>"));
    }

}