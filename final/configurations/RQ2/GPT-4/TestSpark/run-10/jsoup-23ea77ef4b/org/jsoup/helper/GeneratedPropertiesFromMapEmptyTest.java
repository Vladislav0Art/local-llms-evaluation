package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

import java.util.HashMap;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public class GeneratedPropertiesFromMapEmptyTest {

    @Test
    public void propertiesFromMapEmptyTest() {
        assertEquals(0, W3CDom.propertiesFromMap(new HashMap<>()).size());
    }

}