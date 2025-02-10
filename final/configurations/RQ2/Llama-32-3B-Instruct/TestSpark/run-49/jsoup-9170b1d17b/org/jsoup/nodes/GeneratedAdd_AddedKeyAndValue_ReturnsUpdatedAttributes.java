package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneratedAdd_AddedKeyAndValue_ReturnsUpdatedAttributes {

    @Test
    public void add_AddedKeyAndValue_ReturnsUpdatedAttributes() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        List<Attribute> expected = Arrays.asList(new Attribute("key", "value"));
        assertTrue(attributes.asList().equals(expected));
    }

}