package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class GeneratedElementConstructorWithAllParamsTest {

    @Test
    public void ElementConstructorWithAllParamsTest() {
        Element element = new Element(Tag.valueOf("div"), "http://localhost", null);
        Assert.assertNull(element.attributes());
    }

}