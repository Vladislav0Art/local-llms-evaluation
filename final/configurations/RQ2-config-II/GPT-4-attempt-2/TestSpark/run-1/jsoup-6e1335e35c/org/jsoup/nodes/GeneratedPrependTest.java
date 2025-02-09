package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedPrependTest {

    @Test
    public void prependTest() {
        Element parentElement = new Element("parent");
        Element childElement = new Element("child");
        parentElement.prepend(childElement.outerHtml());
        Assert.assertEquals(childElement.outerHtml(), parentElement.child(0).outerHtml());
    }

}