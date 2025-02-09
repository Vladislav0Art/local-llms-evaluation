package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.Assert;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GeneratedRemoveClassTest {

    @Test
    public void removeClassTest() {
        Element element = new Element("div");
        String className = "test";
        element.addClass(className);
        element.removeClass(className);
        Assert.assertFalse(element.hasClass(className));
    }

}