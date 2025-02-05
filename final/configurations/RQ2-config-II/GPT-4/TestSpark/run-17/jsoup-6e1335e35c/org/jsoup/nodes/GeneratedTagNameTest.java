package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

public class GeneratedTagNameTest {

    @Test
    public void tagNameTest() {
        Element element = new Element("p");
        Assert.assertEquals("p", element.tagName());
    }

}