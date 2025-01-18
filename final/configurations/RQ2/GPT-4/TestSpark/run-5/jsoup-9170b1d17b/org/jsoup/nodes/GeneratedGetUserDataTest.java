package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GeneratedGetUserDataTest {

    @Test
    public void getUserDataTest() {
        Attributes attributes = new Attributes();
        attributes.putUserData("key", "object");
        Object result = attributes.getUserData("key");
        Assert.assertEquals("object", result);
    }

}