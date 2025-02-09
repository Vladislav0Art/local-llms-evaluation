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

public class GeneratedEnsureChildNodesTest {

    @Test
    public void ensureChildNodesTest() {
        // Prepare
        Element element = new Element("p");

        // Act
        List<Node> nodes = element.ensureChildNodes();

        // Assert
        Assert.assertNotNull(nodes);
    }

}