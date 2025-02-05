package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.*;

import java.util.Arrays;

public class GeneratedIdTest {

    @Test
    public void idTest() {
        Element element = new Element("div");
        element.id("testId");
        Assert.assertEquals("testId", element.id());
    }

}