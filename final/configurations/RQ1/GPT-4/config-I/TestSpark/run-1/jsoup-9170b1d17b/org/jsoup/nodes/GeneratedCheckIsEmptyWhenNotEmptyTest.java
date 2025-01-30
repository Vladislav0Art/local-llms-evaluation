package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCheckIsEmptyWhenNotEmptyTest {

    @Test
    public void checkIsEmptyWhenNotEmptyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Assert.assertFalse(attributes.isEmpty());
    }

}