package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.mockito.Mockito.mock;

public class GeneratedBodyTest {

    @Test
    public void bodyTest() {
        Document document = new Document("");
        Element element = document.body();
        Assert.assertEquals("body", element.nodeName());
    }

}