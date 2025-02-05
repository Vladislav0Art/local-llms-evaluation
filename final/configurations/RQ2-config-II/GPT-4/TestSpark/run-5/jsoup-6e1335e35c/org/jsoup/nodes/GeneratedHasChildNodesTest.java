package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedHasChildNodesTest {

    @Test
    public void hasChildNodesTest() {
        Element testElement = new Element(Tag.valueOf("div"), "");
        Assert.assertFalse(testElement.hasChildNodes());
    }

}