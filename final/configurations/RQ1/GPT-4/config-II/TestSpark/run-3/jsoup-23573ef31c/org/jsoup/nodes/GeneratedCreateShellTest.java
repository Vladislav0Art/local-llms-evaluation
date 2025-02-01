package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.DataUtil;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class GeneratedCreateShellTest {

    @Test
    public void createShellTest() {
        Document document = Document.createShell("http://example.com");
        Elements headElements = document.select("head");
        Elements bodyElements = document.select("body");
        assertTrue(headElements.size() > 0);
        assertTrue(bodyElements.size() > 0);
    }

}