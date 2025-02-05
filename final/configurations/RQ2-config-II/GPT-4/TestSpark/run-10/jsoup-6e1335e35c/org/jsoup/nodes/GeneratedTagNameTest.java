package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.*;

import java.util.Arrays;

public class GeneratedTagNameTest {

    @Test
    public void tagNameTest() {
        Element element = new Element("div");
        Assert.assertEquals("div", element.tagName());
        element.tagName("p");
        Assert.assertEquals("p", element.tagName());
    }

}