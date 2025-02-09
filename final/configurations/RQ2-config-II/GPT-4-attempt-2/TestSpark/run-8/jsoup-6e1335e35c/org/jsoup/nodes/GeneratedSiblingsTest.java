package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.Assert;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GeneratedSiblingsTest {

    @Test
    public void siblingsTest() {
        Element parent = new Element("div");
        Element child1 = new Element("p");
        Element child2 = new Element("span");
        parent.appendChild(child1);
        parent.appendChild(child2);
        Assert.assertEquals(child2, child1.nextElementSibling());
        Assert.assertEquals(child1, child2.previousElementSibling());
    }

}