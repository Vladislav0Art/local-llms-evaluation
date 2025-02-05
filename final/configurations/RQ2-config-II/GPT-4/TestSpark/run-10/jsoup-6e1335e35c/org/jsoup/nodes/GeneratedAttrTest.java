package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.*;

import java.util.Arrays;

public class GeneratedAttrTest {

    @Test
    public void attrTest() {
        Element element = new Element("p");
        element.attr("class", "test");
        Assert.assertEquals("test", element.attributes().get("class"));
    }

}