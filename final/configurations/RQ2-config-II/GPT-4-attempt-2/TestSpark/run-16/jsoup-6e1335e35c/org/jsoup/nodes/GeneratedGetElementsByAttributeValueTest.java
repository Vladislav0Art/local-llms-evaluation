package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class GeneratedGetElementsByAttributeValueTest {

    @Test
    public void getElementsByAttributeValueTest() {
        Element element = new Element("div").attr("id", "test");
        Assert.assertEquals(1, element.getElementsByAttributeValue("id", "test").size());
    }

}