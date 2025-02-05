package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.*;

import java.util.Arrays;

public class GeneratedBaseUriTest {

    @Test
    public void baseUriTest() {
        Element element = new Element("p");
        element.setBaseUri("http://www.test.com");
        Assert.assertEquals("http://www.test.com", element.baseUri());
    }

}