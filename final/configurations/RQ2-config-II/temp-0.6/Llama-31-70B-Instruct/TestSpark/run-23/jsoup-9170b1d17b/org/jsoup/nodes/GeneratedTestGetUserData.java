package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestGetUserData {

    @Test
    public void testGetUserData() {
        Attributes attributes = new Attributes();
        attributes.putUserData("key", "value");
        Object value = attributes.getUserData("key");
        Assert.assertEquals("value", value);
    }

}