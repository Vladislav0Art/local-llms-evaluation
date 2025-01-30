package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.mockito.Mockito.*;

public class GeneratedCreateElementTest {

    @Test
    public void createElementTest() {
        Document document = new Document("http://test.com");
        Element element = document.createElement("div");
        Assert.assertEquals("div", element.tagName());
    }

}