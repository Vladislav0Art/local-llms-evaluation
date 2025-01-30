package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;

public class GeneratedPutUserDataTest {

    @Test
    public void putUserDataTest() {
        Attributes attributes = new Attributes();
        attributes.putUserData("key", "value");
        Assert.assertEquals("value", attributes.getUserData("key"));
    }

}