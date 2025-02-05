package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedChildTest {

    @Test
    public void childTest() {
        String childTagName = "p";
        Element parentElement = new Element(Tag.valueOf("div"), "");
        parentElement.appendChild(new Element(Tag.valueOf(childTagName), ""));
        Assert.assertEquals(childTagName, parentElement.child(0).tagName());
    }

}