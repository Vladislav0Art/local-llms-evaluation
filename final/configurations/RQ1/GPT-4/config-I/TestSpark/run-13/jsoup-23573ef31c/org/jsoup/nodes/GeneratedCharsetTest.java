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

public class GeneratedCharsetTest {

    @Test
    public void charsetTest() {
        Document document = Document.createShell("https://example.com");
        document.charset(StandardCharsets.ISO_8859_1);
        Assert.assertEquals(StandardCharsets.ISO_8859_1, document.charset());
    }

}