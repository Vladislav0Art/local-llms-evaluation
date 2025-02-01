package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;

public class GeneratedHtmlTest {

    @Test
    public void htmlTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Assert.assertEquals(" key=\"value\"", attributes.html());
    }

}