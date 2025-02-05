package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedIsTestPositive {

    @Test
    public void isTestPositive() {
        String cssQuery = ".testing";
        Element testElement = new Element(Tag.valueOf("div"), "");
        testElement.attr("class", "testing");
        Assert.assertTrue(testElement.is(cssQuery));
    }

}