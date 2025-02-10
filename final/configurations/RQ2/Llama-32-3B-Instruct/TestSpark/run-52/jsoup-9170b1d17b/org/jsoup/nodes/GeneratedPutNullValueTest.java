package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attributes;

import java.util.List;

public class GeneratedPutNullValueTest {

    @Test
    public void putNullValueTest() {
        Attributes attributes = new Attributes();
        attributes.put("test", null);
        assertNotNull(attributes.getUserData("test"));
    }

}