package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.*;

import java.util.Arrays;

public class GeneratedNormalNameTest {

    @Test
    public void normalNameTest() {
        Element element = new Element("DIV");
        Assert.assertEquals("div", element.normalName());
    }

}