package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedPutBooleanNormalScenarioTest {

    @Test
    public void putBooleanNormalScenarioTest() {
        Attributes att = new Attributes();
        att.put("boolean", true);
        Assert.assertEquals("", att.get("boolean"));
    }

}