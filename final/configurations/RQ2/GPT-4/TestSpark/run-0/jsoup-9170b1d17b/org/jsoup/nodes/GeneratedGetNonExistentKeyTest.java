package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.*;

public class GeneratedGetNonExistentKeyTest {

    @Test
    public void getNonExistentKeyTest() {
        Attributes attributes = new Attributes();
        assertNull(attributes.get("non-existent"));
    }

}