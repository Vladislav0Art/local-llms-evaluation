package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GeneratedNormalizeTest {

    @Test
    public void normalizeTest() {
        Attributes attributes = new Attributes();
        attributes.add("kEy1", "VaLuE1");
        attributes.normalize();
        Assert.assertEquals("value1", attributes.get("key1"));
    }

}