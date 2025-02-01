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

public class GeneratedCreateShellTest {

    @Test
    public void createShellTest() {
        Document doc = Document.createShell("http://example.com");
        Assert.assertNotNull(doc);
        Assert.assertEquals("http://example.com", doc.location());
    }

}