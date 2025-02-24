package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.jsoup.safety.Whitelist;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedTestCheckNotNull {

    @Test
    public void testCheckNotNull() {
        Attributes attributes = new Attributes();
        String value = attributes.checkNotNull(null);
        assertEquals("", value);
    }

}