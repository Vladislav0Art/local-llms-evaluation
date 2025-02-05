package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class GeneratedAddAllRegularTest {

    @Test
    public void addAllRegularTest() {
        Attributes attrs1 = new Attributes();
        attrs1.add("key1", "value1");

        Attributes attrs2 = new Attributes();
        attrs2.add("key2", "value2");

        attrs1.addAll(attrs2);
        Assert.assertTrue(attrs1.hasKey("key1") && attrs1.hasKey("key2"));
    }

}