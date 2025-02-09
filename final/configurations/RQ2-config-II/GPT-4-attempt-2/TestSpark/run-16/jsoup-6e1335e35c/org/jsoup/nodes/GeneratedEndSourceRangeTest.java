package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class GeneratedEndSourceRangeTest {

    @Test
    public void endSourceRangeTest() {
        Element element = new Element("div");
        Assert.assertNull(element.endSourceRange());
    }

}