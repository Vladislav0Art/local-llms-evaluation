package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedPutInvalidAttributeTest {

    @Test
    public void putInvalidAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.put("id", null);
        assertNull(attributes.get("id"));
    }

}