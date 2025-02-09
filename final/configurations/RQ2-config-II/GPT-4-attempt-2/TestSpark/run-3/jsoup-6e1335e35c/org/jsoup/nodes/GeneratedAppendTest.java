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

public class GeneratedAppendTest {

    @Test
    public void appendTest() {
        Element parent = new Element("parent");
        parent.append("<child id=\"testId\"></child>");
        Assert.assertEquals(parent.child(0).id(), "testId");
    }

}