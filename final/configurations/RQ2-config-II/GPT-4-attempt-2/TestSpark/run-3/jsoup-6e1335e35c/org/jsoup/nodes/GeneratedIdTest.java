package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GeneratedIdTest {

    @Test
    public void idTest() {
        Element element = new Element("tag");
        element.id("testId");
        Assert.assertEquals(element.id(), "testId");
    }

}