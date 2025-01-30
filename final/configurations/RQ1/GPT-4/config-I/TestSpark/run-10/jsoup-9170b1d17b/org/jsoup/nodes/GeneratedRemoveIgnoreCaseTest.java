package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GeneratedRemoveIgnoreCaseTest {

    @Test
    public void removeIgnoreCaseTest() {
        Attributes attrs = new Attributes();
        attrs.put("Key", "Value");
        attrs.removeIgnoreCase("key");
        Assert.assertFalse(attrs.hasKey("Key"));
    }

}