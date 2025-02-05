package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCloneNormalScenarioTest {

    @Test
    public void cloneNormalScenarioTest() {
        Attributes att1 = new Attributes();
        att1.put("key", "value");

        Attributes att2 = att1.clone();

        Assert.assertEquals(att1, att2);
    }

}