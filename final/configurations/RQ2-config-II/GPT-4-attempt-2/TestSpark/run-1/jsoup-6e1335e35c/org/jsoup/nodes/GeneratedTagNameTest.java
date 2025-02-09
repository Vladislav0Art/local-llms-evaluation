package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedTagNameTest {

    @Test
    public void tagNameTest() {
        Element element = new Element("tag");
        Assert.assertEquals("tag", element.tagName());
    }

}