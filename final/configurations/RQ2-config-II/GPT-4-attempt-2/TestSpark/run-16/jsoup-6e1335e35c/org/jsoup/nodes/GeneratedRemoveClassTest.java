package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class GeneratedRemoveClassTest {

    @Test
    public void removeClassTest() {
        Element element = new Element("div").addClass("test").removeClass("test");
        Assert.assertFalse(element.hasClass("test"));
    }

}