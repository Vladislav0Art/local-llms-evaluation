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

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Element e = new Element("tag");
        Element clone = e.clone();
        Assert.assertNotSame(e, clone);
        Assert.assertEquals(e, clone);
    }

}