package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.Assert;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GeneratedElementTagBaseAttributesConstructorTest {

    @Test
    public void ElementTagBaseAttributesConstructorTest() {
        Element element = new Element(Tag.valueOf("div"), "http://www.google.com",
                new Attributes());
        Assert.assertNotNull(element);
    }

}