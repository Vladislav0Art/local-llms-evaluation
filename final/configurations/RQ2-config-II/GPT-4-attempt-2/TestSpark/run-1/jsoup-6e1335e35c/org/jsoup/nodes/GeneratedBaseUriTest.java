package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedBaseUriTest {

    @Test
    public void baseUriTest() {
        Element element = new Element("tag", "http://mock-uri.com");
        Assert.assertEquals("http://mock-uri.com", element.baseUri());
    }

}