package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.Assert;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GeneratedHasAttributesFalseTest {

    @Test
    public void hasAttributesFalseTest() {
        Element element = new Element("div");
        Assert.assertFalse(element.hasAttributes());
    }

}