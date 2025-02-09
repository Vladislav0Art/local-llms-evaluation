package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedHasDeclaredValueForKeyTest {

    @Test
    public void hasDeclaredValueForKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("Key", "Value");
        Assert.assertTrue(attributes.hasDeclaredValueForKey("Key"));
    }

}