package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedCreateElementTest {

    @Test
    public void createElementTest() {
        Document document = new Document("https://www.google.com");
        Element element = document.createElement("div");
        Assert.assertEquals("<div></div>", element.toString());
    }

}