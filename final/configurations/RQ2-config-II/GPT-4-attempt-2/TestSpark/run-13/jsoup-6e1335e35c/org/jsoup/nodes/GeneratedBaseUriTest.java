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

public class GeneratedBaseUriTest {

    @Test
    public void baseUriTest() {
        // Prepare
        String baseUri = "http://localhost";
        Element element = new Element(Tag.valueOf("p"), baseUri);

        // Act and Assert
        Assert.assertEquals(baseUri, element.baseUri());
    }

}