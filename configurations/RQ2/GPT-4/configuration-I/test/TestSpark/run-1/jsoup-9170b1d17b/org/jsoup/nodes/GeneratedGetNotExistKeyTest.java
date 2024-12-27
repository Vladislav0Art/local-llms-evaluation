package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class GeneratedGetNotExistKeyTest {

    @Test
    public void getNotExistKeyTest() {
        Assert.assertNull(new Attributes().get("notExistKey"));
    }

}