package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneratedPutBoolean_BooleanValue_PutReturnsUpdatedAttributes {

    @Test
    public void putBoolean_BooleanValue_PutReturnsUpdatedAttributes() {
        Attributes attributes = new Attributes();
        Attribute attribute = new Attribute("key", "value");
        attributes.put(attribute);
        List<Attribute> expected = Arrays.asList(attribute);
        assertTrue(attributes.asList().equals(expected));
    }
}

public class Attributes {

    public int indexOfKey(String key) {
        // Method implementation
    }

    public String get(Document doc, String key) {
        // Method implementation
    }

    public void put(String key, Object value) {
        // Method implementation
    }

    public boolean hasKey(String key) {
        // Method implementation
    }

    public int size() {
        // Method implementation
    }

}