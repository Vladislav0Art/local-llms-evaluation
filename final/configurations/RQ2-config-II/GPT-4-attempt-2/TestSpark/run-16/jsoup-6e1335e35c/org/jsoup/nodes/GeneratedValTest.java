package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class GeneratedValTest {

    @Test
    public void valTest() {
        Element element = new Element("input").val("test");
        Assert.assertEquals("test", element.val());
    }

}