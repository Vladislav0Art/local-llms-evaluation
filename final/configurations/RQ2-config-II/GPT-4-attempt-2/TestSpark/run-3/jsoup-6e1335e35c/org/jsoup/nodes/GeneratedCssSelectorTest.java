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

public class GeneratedCssSelectorTest {

    @Test
    public void cssSelectorTest() {
        Element parent = new Element("parent");
        Element child = new Element("child");
        child.id("testId");
        parent.appendChild(child);
        Assert.assertEquals(child.cssSelector(), "#testId");
    }

}