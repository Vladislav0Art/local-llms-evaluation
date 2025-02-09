package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class GeneratedGetElementsByAttributeTest {

    @Test
    public void getElementsByAttributeTest() {
        Element element = new Element("div").attr("id", "test");
        Assert.assertEquals(1, element.getElementsByAttribute("id").size());
    }

}