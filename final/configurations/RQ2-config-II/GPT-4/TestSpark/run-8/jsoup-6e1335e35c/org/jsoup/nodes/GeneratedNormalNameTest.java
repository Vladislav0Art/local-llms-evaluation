package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GeneratedNormalNameTest {

    @Test
    public void normalNameTest() {
        Element element = new Element(Tag.valueOf("h1"), "");
        Assert.assertEquals("h1", element.normalName());
    }

}