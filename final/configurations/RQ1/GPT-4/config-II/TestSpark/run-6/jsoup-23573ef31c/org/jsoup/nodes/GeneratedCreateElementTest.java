package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document.OutputSettings.Syntax;
import org.jsoup.nodes.Entities.EscapeMode;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedCreateElementTest {

    @Test
    public void createElementTest() {
        Document doc = new Document("http://example.com");
        Element elem = doc.createElement("span");
        Assert.assertEquals("<span></span>", elem.outerHtml());
    }

}