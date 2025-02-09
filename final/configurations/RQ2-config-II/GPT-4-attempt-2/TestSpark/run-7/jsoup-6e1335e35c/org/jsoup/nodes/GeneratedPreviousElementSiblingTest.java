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

public class GeneratedPreviousElementSiblingTest {

    @Test
    public void previousElementSiblingTest() {
        Element parent = new Element("div");
        Element child1 = new Element("span");
        Element child2 = new Element("span");

        parent.appendChild(child1);
        parent.appendChild(child2);

        Assert.assertEquals(child1, child2.previousElementSibling());
    }

}