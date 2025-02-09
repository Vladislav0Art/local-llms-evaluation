package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.Assert;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GeneratedTagNameTest {

    @Test
    public void tagNameTest() {
        String tag = "div";
        Element element = new Element(tag);
        Assert.assertEquals(tag, element.tagName());
    }

}