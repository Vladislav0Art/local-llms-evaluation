package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GeneratedGetIgnoreCaseTest {

    @Test
    public void getIgnoreCaseTest() {
        Attributes attrs = new Attributes();
        attrs.put("Key", "Value");
        String result = attrs.getIgnoreCase("key");
        Assert.assertEquals(result, "Value");
    }

}