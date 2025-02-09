package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedIdTest {

    @Test
    public void idTest() {
        Element element = new Element("tag");
        element.id("id123");
        Assert.assertEquals("id123", element.id());
    }

}