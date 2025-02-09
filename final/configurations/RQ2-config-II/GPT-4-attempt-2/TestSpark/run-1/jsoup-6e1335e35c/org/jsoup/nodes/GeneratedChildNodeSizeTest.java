package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedChildNodeSizeTest {

    @Test
    public void childNodeSizeTest() {
        Element parentElement = new Element("parent");
        Element childElement = new Element("child");
        parentElement.appendChild(childElement);
        Assert.assertEquals(1, parentElement.childNodeSize());
    }

}