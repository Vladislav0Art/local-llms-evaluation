package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCreateElementTest {

    @Test
    public void createElementTest() {
        Document document = new Document("https://www.example.com");
        Element element = document.createElement("p");
        Assert.assertEquals("p", element.nodeName());
    }

}