package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedHasAttributesTest {

    @Test
    public void hasAttributesTest() {
        Element element = new Element("tag");
        element.attr("key", "value");
        Assert.assertTrue(element.hasAttributes());
    }

}