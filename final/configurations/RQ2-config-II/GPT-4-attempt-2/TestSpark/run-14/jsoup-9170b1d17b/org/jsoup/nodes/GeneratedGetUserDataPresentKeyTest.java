package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedGetUserDataPresentKeyTest {

    @Test
    public void getUserDataPresentKeyTest() {
        Attributes attributes = new Attributes();
        attributes.putUserData("Key", "Value");
        Assert.assertEquals("Value", attributes.getUserData("Key"));
    }

}