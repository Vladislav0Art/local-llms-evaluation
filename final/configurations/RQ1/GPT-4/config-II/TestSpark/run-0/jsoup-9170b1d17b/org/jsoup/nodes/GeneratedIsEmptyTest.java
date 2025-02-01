package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsEmptyTest {

    @Test
    public void isEmptyTest() {
        Attributes attributes = new Attributes();
        Assert.assertTrue(attributes.isEmpty());
    }

}