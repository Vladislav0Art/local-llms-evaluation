package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedGetNonExistingKey {

    @Test
    public void GetNonExistingKey() {
        Attributes attributes = new Attributes();
        String value = attributes.get("key");
        assertEquals("", value);
    }

}