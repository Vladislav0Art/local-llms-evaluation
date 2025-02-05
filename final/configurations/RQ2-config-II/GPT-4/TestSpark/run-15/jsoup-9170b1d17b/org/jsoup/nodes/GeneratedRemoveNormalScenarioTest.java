package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedRemoveNormalScenarioTest {

    @Test
    public void removeNormalScenarioTest() {
        Attributes att = new Attributes();
        att.put("key", "value");
        att.remove("key");
        Assert.assertEquals("", att.get("key"));
    }

}