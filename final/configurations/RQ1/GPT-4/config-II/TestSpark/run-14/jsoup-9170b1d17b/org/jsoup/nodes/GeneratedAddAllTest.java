package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.Map;

public class GeneratedAddAllTest {

    @Test
    public void addAllTest() {
        Attributes attrs1 = new Attributes();
        attrs1.put("key1", "value1");
        Attributes attrs2 = new Attributes();
        attrs2.put("key2", "value2");
        attrs1.addAll(attrs2);
        Assert.assertEquals(2, attrs1.size());
    }

}