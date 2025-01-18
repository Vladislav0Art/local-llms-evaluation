package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GeneratedCssSelectorTest {

    @Test
    public void cssSelectorTest() {
        Element el = new Element("test");
        Assert.assertEquals("", el.cssSelector());
    }

}