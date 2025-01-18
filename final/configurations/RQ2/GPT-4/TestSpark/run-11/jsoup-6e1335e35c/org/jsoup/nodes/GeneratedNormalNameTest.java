package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GeneratedNormalNameTest {

    @Test
    public void normalNameTest() {
        Element el = new Element("test");
        Assert.assertEquals("test", el.normalName());
    }

}