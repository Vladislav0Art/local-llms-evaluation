package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.nodes.*;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedCreateElementTest {

    @Test
    public void createElementTest() {
        Document document = Document.createShell("http://example.com");
        Element element = document.createElement("div");
        Assert.assertEquals("div", element.nodeName());
    }

}