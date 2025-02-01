package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedPutUserDataTest {

    @Test
    public void PutUserDataTest() {
        Attributes attributes = new Attributes();
        attributes.putUserData("key", "value");
        Object value = attributes.getUserData("key");
        assertEquals("value", value);
    }

}