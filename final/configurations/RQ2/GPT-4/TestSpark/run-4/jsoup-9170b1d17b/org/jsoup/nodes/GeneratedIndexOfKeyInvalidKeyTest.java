package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class GeneratedIndexOfKeyInvalidKeyTest {

    @Test
    public void indexOfKeyInvalidKeyTest() {
        Attributes attributes = new Attributes();
        Assert.assertEquals(-1, attributes.indexOfKey("key"));
    }

}