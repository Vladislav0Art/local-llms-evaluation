package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.Assert;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GeneratedAddClassTest {

    @Test
    public void addClassTest() {
        Element element = new Element("div");
        String className = "test";
        element.addClass(className);
        Assert.assertTrue(element.hasClass(className));
    }

}