package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        Element element = new Element("tag");
        element.text("Element Text");
        Assert.assertEquals("Element Text", element.text());
    }

}