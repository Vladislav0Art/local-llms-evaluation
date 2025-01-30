package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedLocationTest {

    @Test
    public void locationTest() {
        Document document = Document.createShell("https://example.com");
        Assert.assertEquals("https://example.com", document.location());
    }

}