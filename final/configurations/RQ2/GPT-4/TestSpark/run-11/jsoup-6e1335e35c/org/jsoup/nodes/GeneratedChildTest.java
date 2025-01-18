package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GeneratedChildTest {

    @Test
    public void childTest() {
        Element el = new Element("test");
        el.appendChild(new Element("child"));
        Assert.assertEquals("child", el.child(0).tagName());
    }

}