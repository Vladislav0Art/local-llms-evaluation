package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

public class GeneratedAppendChildTest {

    @Test
    public void appendChildTest() {
        Element parent = new Element("div");
        Node child = new Element("p");
        parent.appendChild(child);
        Assert.assertTrue(parent.childNodeSize() == 1);
    }

}