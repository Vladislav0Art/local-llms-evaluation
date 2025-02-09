package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.mockito.Mockito.mock;

public class GeneratedHeadTest {

    @Test
    public void headTest() {
        Document document = new Document("");
        Element element = document.head();
        Assert.assertEquals("head", element.nodeName());
    }

}