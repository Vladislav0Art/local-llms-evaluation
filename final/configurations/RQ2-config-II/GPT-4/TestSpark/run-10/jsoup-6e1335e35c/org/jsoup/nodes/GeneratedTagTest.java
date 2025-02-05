package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.*;

import java.util.Arrays;

public class GeneratedTagTest {

    @Test
    public void tagTest() {
        Element element = new Element("div");
        Assert.assertEquals(Tag.valueOf("div"), element.tag());
    }

}