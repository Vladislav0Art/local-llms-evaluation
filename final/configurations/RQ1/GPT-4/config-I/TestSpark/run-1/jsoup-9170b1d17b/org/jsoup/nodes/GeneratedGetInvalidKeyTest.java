package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGetInvalidKeyTest {

    @Test
    public void getInvalidKeyTest() {
        Attributes attributes = new Attributes();
        String value = attributes.get("invalidKey");
        Assert.assertEquals("", value);
    }

}