package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.Assert;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Element element = new Element("div");
        Element clone = element.clone();
        Assert.assertNotSame(clone, element);
    }

}