package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedDeduplicateTest {

    @Test
    public void deduplicateTest() {
        Attributes attributes = new Attributes();
        attributes.put("Key", "Value");
        attributes.put("Key", "Value");
        ParseSettings parseSettings = new ParseSettings(true, false);
        Assert.assertEquals(1, attributes.deduplicate(parseSettings));
    }

}