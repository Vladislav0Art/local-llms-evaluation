package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetMissingKeyTest {

    @Test
    public void getMissingKeyTest() {
        Attributes attributes = new Attributes();
        String value = attributes.get("missingKey");
        Assert.assertEquals("", value);
    }

}