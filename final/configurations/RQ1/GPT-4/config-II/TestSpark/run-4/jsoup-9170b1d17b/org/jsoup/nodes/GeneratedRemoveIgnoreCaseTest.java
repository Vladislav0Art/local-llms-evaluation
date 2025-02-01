package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class GeneratedRemoveIgnoreCaseTest {

    @Test
    public void removeIgnoreCaseTest() {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        attrs.removeIgnoreCase("KEY1");
        Assert.assertFalse(attrs.hasKeyIgnoreCase("KEY1"));
    }

}