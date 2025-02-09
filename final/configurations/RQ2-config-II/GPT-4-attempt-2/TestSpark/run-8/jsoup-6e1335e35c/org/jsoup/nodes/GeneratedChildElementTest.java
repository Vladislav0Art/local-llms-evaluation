package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.Assert;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GeneratedChildElementTest {

    @Test
    public void childElementTest() {
        Element element = new Element("div");
        Element child = new Element("p");
        element.appendChild(child);
        Assert.assertEquals(child, element.child(0));
    }

}