package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        Attributes attributes1 = new Attributes();
        attributes1.add("key", "value");
        Attributes attributes2 = new Attributes();
        attributes2.add("key", "value");
        Assert.assertEquals(attributes1, attributes2);
    }

}