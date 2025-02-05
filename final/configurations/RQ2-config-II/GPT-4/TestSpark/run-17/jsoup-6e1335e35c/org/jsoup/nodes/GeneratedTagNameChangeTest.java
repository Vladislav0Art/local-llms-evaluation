package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

public class GeneratedTagNameChangeTest {

    @Test
    public void tagNameChangeTest() {
        Element element = new Element("div");
        element.tagName("p");
        Assert.assertEquals("p", element.tagName());
    }

}