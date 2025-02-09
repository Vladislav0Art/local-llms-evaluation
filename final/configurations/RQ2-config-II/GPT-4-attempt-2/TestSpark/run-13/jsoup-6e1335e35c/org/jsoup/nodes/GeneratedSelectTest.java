package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.SerializationException;
import org.jsoup.nodes.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GeneratedSelectTest {

    @Test
    public void selectTest() {
        // Prepare
        Element element = new Element("p").attr("testAttr", "testValue");

        // Act
        Elements elements = element.select("[testAttr=testValue]");

        // Assert
        Assert.assertEquals(1, elements.size());
        Assert.assertEquals(element, elements.get(0));
    }

}