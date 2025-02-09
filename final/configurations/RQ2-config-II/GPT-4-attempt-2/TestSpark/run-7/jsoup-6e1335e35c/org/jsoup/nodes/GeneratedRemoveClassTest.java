package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.Collections;

import static org.mockito.Mockito.*;

public class GeneratedRemoveClassTest {

    @Test
    public void removeClassTest() {
        Element element = new Element("div");
        element.attr("class", "myClass");
        Assert.assertTrue(element.hasClass("myClass"));

        element.removeClass("myClass");
        Assert.assertFalse(element.hasClass("myClass"));
    }

}