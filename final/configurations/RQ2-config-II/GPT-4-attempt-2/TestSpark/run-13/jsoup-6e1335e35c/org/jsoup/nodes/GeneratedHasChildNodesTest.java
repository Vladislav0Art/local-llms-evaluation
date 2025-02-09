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

public class GeneratedHasChildNodesTest {

    @Test
    public void hasChildNodesTest() {
        // Prepare
        Element element = new Element("p");

        // Act and Assert
        Assert.assertFalse(element.hasChildNodes());
    }

}