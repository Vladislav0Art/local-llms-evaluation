package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.Map;

public class GeneratedGetInvalidAttributeTest {

    @Test
    public void getInvalidAttributeTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        Assert.assertEquals("", attrs.get("non-existent-key"));
    }

}