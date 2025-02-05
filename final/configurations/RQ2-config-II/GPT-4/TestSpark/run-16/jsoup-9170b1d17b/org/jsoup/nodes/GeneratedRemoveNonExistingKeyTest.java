package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedRemoveNonExistingKeyTest {

    @Test
    public void removeNonExistingKeyTest() {
        Attributes attributes = new Attributes();
        attributes.remove("key");
        Assert.assertNull(attributes.get("key"));
    }

}