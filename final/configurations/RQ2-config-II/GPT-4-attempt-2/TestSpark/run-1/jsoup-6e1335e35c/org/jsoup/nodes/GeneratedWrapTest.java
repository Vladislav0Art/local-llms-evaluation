package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedWrapTest {

    @Test
    public void wrapTest() {
        Element element = new Element("tag");
        element.wrap("<article></article>");
        Assert.assertEquals("article", element.parent().tagName());
    }

}