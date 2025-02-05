package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedEqualsNormalScenarioTest {

    @Test
    public void equalsNormalScenarioTest() {
        Attributes att1 = new Attributes();
        att1.put("key", "value");

        Attributes att2 = new Attributes();
        att2.put("key", "value");

        Assert.assertTrue(att1.equals(att2));
    }

}