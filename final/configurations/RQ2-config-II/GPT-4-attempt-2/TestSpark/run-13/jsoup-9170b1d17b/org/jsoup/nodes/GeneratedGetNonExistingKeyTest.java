package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.io.IOException;
import java.util.Iterator;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetNonExistingKeyTest {

    @Test
    public void getNonExistingKeyTest() {
        Attributes attributes = new Attributes();
        String result = attributes.get("key");
        assertTrue(result.isEmpty());
    }

}