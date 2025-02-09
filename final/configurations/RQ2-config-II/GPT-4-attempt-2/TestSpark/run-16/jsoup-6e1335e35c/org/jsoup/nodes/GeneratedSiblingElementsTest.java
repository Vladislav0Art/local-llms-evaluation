package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class GeneratedSiblingElementsTest {

    @Test
    public void siblingElementsTest() {
        Element parent = new Element("div");
        parent.appendElement("span");
        parent.appendElement("p");
        Assert.assertEquals(1, parent.child(0).siblingElements().size());
    }

}