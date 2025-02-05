package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAddNormalScenarioTest {

    @Test
    public void addNormalScenarioTest() {
        Attributes att = new Attributes();
        att.add("key", "value");
        Assert.assertEquals("value", att.get("key"));
    }

}