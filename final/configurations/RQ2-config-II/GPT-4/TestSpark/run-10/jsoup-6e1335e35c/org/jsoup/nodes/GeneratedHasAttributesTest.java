package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.*;

import java.util.Arrays;

public class GeneratedHasAttributesTest {

    @Test
    public void hasAttributesTest() {
        Element element = new Element("div");
        Assert.assertFalse(element.hasAttributes());
        element.attr("class", "test");
        Assert.assertTrue(element.hasAttributes());
    }

}