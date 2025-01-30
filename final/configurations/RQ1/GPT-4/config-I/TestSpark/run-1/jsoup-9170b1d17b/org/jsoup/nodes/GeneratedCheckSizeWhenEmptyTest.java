package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCheckSizeWhenEmptyTest {

    @Test
    public void checkSizeWhenEmptyTest() {
        Attributes attributes = new Attributes();
        Assert.assertEquals(0, attributes.size());
    }

}