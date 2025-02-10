package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneratedPut_NullValue_PutReturnsUpdatedAttributes {

    @Test
    public void put_NullValue_PutReturnsUpdatedAttributes() {
        Attributes attributes = new Attributes();
        attributes.put("", null);
        List<Attribute> expected = Collections.emptyList();
        assertTrue(attributes.asList().equals(expected));
    }

}