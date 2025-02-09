package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.Assert;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GeneratedAppendTextTest {

    @Test
    public void appendTextTest() {
        Element element = new Element("div");
        String text = "This is a test";
        element.appendText(text);
        Assert.assertEquals(text, element.text());
    }

}