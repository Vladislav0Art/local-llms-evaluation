package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedSelectTestPositive {

    @Test
    public void selectTestPositive() {
        String cssQuery = "p";
        Element testElement = new Element(Tag.valueOf("div"), "");
        testElement.appendChild(new Element(Tag.valueOf("p"), ""));
        Elements elements = testElement.select(cssQuery);
        Assert.assertNotNull(elements);
        Assert.assertEquals(1, elements.size());
    }

}