package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GeneratedChildrenTest {

    @Test
    public void childrenTest() {
        Element parent = new Element("div");
        Element child1 = new Element("p");
        Element child2 = new Element("h1");
        parent.appendChild(child1);
        parent.appendChild(child2);

        List<String> expected = new ArrayList<>(Collections.singletonList("p"));
        expected.add("h1");

        Elements children = parent.children();
        List<String> actual = new ArrayList<>();
        for (Object child : children) {
            actual.add(((Element) child).tagName());
        }

        Assert.assertEquals(expected, actual);
    }

}