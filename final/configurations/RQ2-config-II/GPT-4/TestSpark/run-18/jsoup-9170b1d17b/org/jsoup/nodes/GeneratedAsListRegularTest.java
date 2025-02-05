package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class GeneratedAsListRegularTest {

    @Test
    public void asListRegularTest() {
        Attributes attrs = new Attributes();
        attrs.add("key1", "value1");

        List<Attribute> attrsList = attrs.asList();

        Assert.assertEquals(1, attrsList.size());
        for (Attribute attribute : attrsList) {
            Assert.assertEquals("key1", attribute.getKey());
            Assert.assertEquals("value1", attribute.getValue());
        }
    }

}