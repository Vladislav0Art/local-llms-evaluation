package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.Map;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() throws Exception {
        Attributes attrs1 = new Attributes();
        attrs1.put("key1", "value1");
        attrs1.put("key2", "value2");
        Attributes attrs2 = attrs1.clone();
        attrs2.put("key3", "value3");
        Assert.assertTrue(attrs1.size() != attrs2.size());
    }

}