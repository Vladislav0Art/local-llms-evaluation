package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedPutAttributeNormalScenarioTest {

    @Test
    public void putAttributeNormalScenarioTest() {
        Attributes att = new Attributes();
        Attribute attribute = new Attribute("key", "value");
        att.put(attribute);
        Assert.assertEquals("value", att.get("key"));
    }

}