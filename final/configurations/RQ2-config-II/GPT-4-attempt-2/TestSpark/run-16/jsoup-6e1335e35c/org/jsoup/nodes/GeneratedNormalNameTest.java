package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class GeneratedNormalNameTest {

    @Test
    public void normalNameTest() {
        Element element = new Element("DIV");
        Assert.assertEquals("div", element.normalName());
    }

}