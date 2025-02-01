package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() throws Exception {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Attributes clone = attributes.clone();
        Assert.assertEquals(attributes, clone);
    }

}