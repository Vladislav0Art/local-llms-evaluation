package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;

public class GeneratedGetIgnoreCaseExistentKeyTest {

    @Test
    public void getIgnoreCaseExistentKeyTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        Assert.assertEquals("value", attrs.getIgnoreCase("KEY"));
    }

}