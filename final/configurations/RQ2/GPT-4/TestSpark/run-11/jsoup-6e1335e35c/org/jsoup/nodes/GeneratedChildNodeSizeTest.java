package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GeneratedChildNodeSizeTest {

    @Test
    public void childNodeSizeTest() {
        Element el = new Element("test");
        el.appendChild(new TextNode("childNode"));
        Assert.assertEquals(1, el.childNodeSize());
    }

}