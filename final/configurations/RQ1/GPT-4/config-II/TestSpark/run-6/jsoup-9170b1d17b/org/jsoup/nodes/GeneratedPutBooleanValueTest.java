package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GeneratedPutBooleanValueTest {

    @Test
    public void putBooleanValueTest() {
        String key = "booleanAttribute";
        Attributes attributes = new Attributes();
        attributes.put(key, true);
        Assert.assertTrue(attributes.hasKey(key));
    }

}