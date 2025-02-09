package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class GeneratedShallowCloneTest {

    @Test
    public void shallowCloneTest() {
        Element element = new Element("div");
        Assert.assertNotSame(element, element.shallowClone());
    }

}