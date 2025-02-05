package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAddAllNormalScenarioTest {

    @Test
    public void addAllNormalScenarioTest() {
        Attributes att1 = new Attributes();
        att1.put("key", "value");

        Attributes att2 = new Attributes();
        att2.put("key2", "value2");

        att1.addAll(att2);

        Assert.assertEquals(2, att1.size());
    }

}