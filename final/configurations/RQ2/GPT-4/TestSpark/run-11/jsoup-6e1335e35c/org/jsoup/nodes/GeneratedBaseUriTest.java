package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GeneratedBaseUriTest {

    @Test
    public void baseUriTest() {
        Element el = new Element("test");
        el.setBaseUri("http://sample.com");
        Assert.assertEquals("http://sample.com", el.baseUri());
    }

}