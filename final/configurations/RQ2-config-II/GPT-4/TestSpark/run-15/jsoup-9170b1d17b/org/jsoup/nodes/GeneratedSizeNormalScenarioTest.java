package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSizeNormalScenarioTest {

    @Test
    public void sizeNormalScenarioTest() {
        Attributes att = new Attributes();
        att.put("key", "value");
        att.put("key2", "value2");
        Assert.assertEquals(2, att.size());
    }

}