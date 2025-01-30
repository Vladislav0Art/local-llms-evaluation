package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        try {
            Attributes attrs = new Attributes();
            attrs.put("key", "value");
            Attributes cloned = attrs.clone();
            Assert.assertTrue(cloned.hasKey("key"));
        } catch (Exception e) {
            Assert.fail();
        }
    }

}