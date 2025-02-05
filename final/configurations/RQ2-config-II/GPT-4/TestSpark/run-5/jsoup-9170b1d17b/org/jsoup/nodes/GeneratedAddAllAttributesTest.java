package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedAddAllAttributesTest {

    @Test
    public void addAllAttributesTest() {
        Attributes attributes1 = new Attributes();
        attributes1.put("id", "1");

        Attributes attributes2 = new Attributes();
        attributes2.put("class", "container");

        attributes1.addAll(attributes2);
        assertTrue(attributes1.hasKey("class"));
    }

}