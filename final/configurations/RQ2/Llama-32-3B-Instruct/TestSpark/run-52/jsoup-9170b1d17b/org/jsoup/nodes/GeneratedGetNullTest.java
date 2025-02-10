package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attributes;

import java.util.List;

public class GeneratedGetNullTest {

    @Test
    public void getNullTest() {
        Attributes attributes = new Attributes();
        assertTrue(attributes.get(null) == null);
    }

}