package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GeneratedEnsureChildNodesTest {

    @Test
    public void ensureChildNodesTest() {
        Element el = new Element("test");
        el.ensureChildNodes().add(new TextNode("childNode"));
        Assert.assertTrue(el.hasChildNodes());
    }

}