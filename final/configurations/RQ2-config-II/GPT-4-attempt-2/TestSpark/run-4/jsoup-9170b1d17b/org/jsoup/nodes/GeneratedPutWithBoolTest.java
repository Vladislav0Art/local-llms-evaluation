package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.helper.Validate;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class GeneratedPutWithBoolTest {

    @Test
    public void putWithBoolTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", true);
        Assert.assertEquals("", attrs.get("key"));
    }

}