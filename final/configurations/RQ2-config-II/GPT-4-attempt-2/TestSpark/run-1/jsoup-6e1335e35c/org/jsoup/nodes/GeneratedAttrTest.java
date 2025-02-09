package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedAttrTest {

    @Test
    public void attrTest() {
        Element element = new Element("tag");
        element.attr("key", "value");
        Assert.assertEquals("value", element.attr("key"));
    }

}