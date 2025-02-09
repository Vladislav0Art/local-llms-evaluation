package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GeneratedAddAllTest {

    @Test
    public void addAllTest() {
        Attributes attributesA = new Attributes();
        Attributes attributesB = new Attributes();

        attributesA.put("key1", "value1");
        attributesB.put("key2", "value2");

        attributesA.addAll(attributesB);

        Assert.assertEquals(2, attributesA.size());
        Assert.assertTrue(attributesA.hasKey("key1"));
        Assert.assertTrue(attributesA.hasKey("key2"));
    }

}