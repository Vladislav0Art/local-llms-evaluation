package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.mockito.Mockito.mock;

public class GeneratedCreateElementTest {

    @Test
    public void createElementTest() {
        Document document = new Document("");
        Element element = document.createElement("div");
        Assert.assertEquals("div", element.nodeName());
    }

}