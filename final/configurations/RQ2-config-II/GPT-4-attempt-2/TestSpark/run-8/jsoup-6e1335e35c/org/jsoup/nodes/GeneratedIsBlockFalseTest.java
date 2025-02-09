package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.Assert;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GeneratedIsBlockFalseTest {

    @Test
    public void isBlockFalseTest() {
        Element element = new Element("div");
        Assert.assertFalse(element.isBlock());
    }

}