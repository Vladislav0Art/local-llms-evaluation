package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.*;

public class GeneratedIsNotEmptyTest {

    @Test
    public void isNotEmptyTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        assertFalse(attributes.isEmpty());
    }

}