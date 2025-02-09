package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedGetUserDataAbsentKeyTest {

    @Test
    public void getUserDataAbsentKeyTest() {
        Attributes attributes = new Attributes();
        Assert.assertNull(attributes.getUserData("Key"));
    }

}