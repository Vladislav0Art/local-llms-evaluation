package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.*;

import java.util.Arrays;

public class GeneratedChildNodeSizeTest {

    @Test
    public void childNodeSizeTest() {
        Element element = new Element("div");
        Element childElement1 = new Element("p");
        Element childElement2 = new Element("span");
        element.appendChild(childElement1);
        element.appendChild(childElement2);
        Assert.assertEquals(2, element.childNodeSize());
    }

}