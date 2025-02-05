package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedHasChildNodesWhenChildExistsTest {

    @Test
    public void hasChildNodesWhenChildExistsTest() {
        Element testElement = new Element(Tag.valueOf("div"), "");
        testElement.appendChild(new Element(Tag.valueOf("p"), ""));
        Assert.assertTrue(testElement.hasChildNodes());
    }

}