package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GeneratedHasAttributesTrueTest {

    @Test
    public void hasAttributesTrueTest() {
        Element el = new Element("test");
        el.attr("attr", "val");
        Assert.assertTrue(el.hasAttributes());
    }

}