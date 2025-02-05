package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.*;

import java.util.Arrays;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        Element element = new Element("div");
        Assert.assertEquals("div", element.nodeName());
    }

}