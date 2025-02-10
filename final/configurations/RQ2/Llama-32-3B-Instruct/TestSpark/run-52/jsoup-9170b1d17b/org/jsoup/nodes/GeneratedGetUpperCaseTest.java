package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attributes;

import java.util.List;

public class GeneratedGetUpperCaseTest {

    @Test
    public void getUpperCaseTest() {
        Attributes attributes = new Attributes();
        attributes.add("TEST", "VALUE");
        assertEquals("VALUE", attributes.getIgnoreCase("TEST"));
    }

}