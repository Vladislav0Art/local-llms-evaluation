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

public class GeneratedChildTest {

    @Test
    public void childTest() {
        Element parent = new Element("div");
        Element child = new Element("span");
        parent.appendChild(child);

        Assert.assertEquals(child, parent.child(0));
    }

}