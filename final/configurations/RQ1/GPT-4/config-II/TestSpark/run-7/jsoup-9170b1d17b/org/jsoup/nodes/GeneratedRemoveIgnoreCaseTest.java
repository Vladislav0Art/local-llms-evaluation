package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;

public class GeneratedRemoveIgnoreCaseTest {

    @Test
    public void removeIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.put("KEY", "value");
        attributes.removeIgnoreCase("key");
        Assert.assertEquals("", attributes.get("KEY"));
    }

}