package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.Map;

public class GeneratedRemoveIgnoreCaseTest {

    @Test
    public void removeIgnoreCaseTest() {
        Attributes attrs = new Attributes();
        attrs.put("Key", "value");
        attrs.removeIgnoreCase("key");
        Assert.assertFalse(attrs.hasKey("Key"));
    }

}