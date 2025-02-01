package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GeneratedGetNonExistingKeyTest {

    @Test
    public void getNonExistingKeyTest() {
        String key = "attributeTestKey";
        Attributes attributes = new Attributes();
        Assert.assertEquals("", attributes.get(key));
    }

}