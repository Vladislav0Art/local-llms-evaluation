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

public class GeneratedAppendToTest {

    @Test
    public void appendToTest() {
        Element parent = new Element("div");
        Element child = new Element("span");

        child.appendTo(parent);

        Assert.assertEquals(child, parent.child(0));
    }

}