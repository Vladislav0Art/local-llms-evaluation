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

public class GeneratedAppendChildTest {

    @Test
    public void appendChildTest() {
        // Prepare
        Element element = new Element("p");
        Element child = new Element("div");

        // Act
        element.appendChild(child);

        // Assert
        Assert.assertEquals(1, element.children().size());
        Assert.assertEquals(child, element.child(0));
    }

}