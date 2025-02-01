package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.Map;

public class GeneratedIteratorTest {

    @Test
    public void iteratorTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        attrs.put("foo", "bar");
        Iterator<Map.Entry<String, String>> iterator = attrs.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            iterator.next();
            count++;
        }
        Assert.assertEquals(2, count);
    }

}