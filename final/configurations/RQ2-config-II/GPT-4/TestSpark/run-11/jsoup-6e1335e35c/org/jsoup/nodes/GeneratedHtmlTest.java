package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.jsoup.parser.Tag;
import org.jsoup.nodes.Attributes;
import org.jsoup.select.Evaluator;
import org.junit.Test;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

public class GeneratedHtmlTest {

    @Test
    public void htmlTest() {
        Element e = new Element("tag");
        e.html("<child></child>");
        Assert.assertEquals("<child></child>", e.html());
    }

}