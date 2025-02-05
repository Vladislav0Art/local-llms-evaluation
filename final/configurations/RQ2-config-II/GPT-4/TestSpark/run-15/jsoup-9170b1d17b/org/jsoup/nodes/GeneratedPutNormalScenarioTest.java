package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedPutNormalScenarioTest {

    @Test
    public void putNormalScenarioTest() {
        Attributes att = new Attributes();
        att.put("key", "value");
        Assert.assertEquals("value", att.get("key"));
    }

}