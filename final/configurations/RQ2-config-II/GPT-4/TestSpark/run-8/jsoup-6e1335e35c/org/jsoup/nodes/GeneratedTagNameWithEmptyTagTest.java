package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GeneratedTagNameWithEmptyTagTest {

    @Test
    public void tagNameWithEmptyTagTest() {
        Element element = new Element("");
        Assert.assertEquals("", element.tagName());
    }

}