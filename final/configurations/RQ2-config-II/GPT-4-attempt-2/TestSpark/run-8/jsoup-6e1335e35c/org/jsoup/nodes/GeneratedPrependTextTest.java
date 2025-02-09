package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.Assert;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GeneratedPrependTextTest {

    @Test
    public void prependTextTest() {
        Element element = new Element("div");
        String text = "This is a test";
        element.prependText(text);
        Assert.assertEquals(text, element.text());
    }

}