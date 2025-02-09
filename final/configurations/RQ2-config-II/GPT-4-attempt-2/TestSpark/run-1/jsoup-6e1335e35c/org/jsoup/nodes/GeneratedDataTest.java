package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedDataTest {

    @Test
    public void dataTest() {
        Element element = new Element("tag");
        element.prepend("<data>This is a data tag</data>");
        Assert.assertEquals("<data>This is a data tag</data>", element.child(0).outerHtml());
        Assert.assertEquals("This is a data tag", element.child(0).text());
    }

}