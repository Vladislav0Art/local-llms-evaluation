package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attributes;

import java.util.List;

public class GeneratedGetEmptyTest {

    @Test
    public void getEmptyTest() {
        Attributes attributes = new Attributes();
        assertEquals("", attributes.get(""));
    }

}