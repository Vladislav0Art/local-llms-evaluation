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

public class GeneratedParentsTest {

    @Test
    public void parentsTest() {
        Element parent = new Element("div");
        Element child = parent.appendElement("span");
        Elements parents = child.parents();

        Assert.assertEquals(1, parents.size());
        Assert.assertEquals(parent, parents.get(0));
    }

}