package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedTestGetUserData {

    @Test
    public void testGetUserData() {
        Attributes attributes = new Attributes();
        Object userData = "test";
        attributes.putUserData("key", userData);
        assertEquals(userData, attributes.getUserData("key"));
    }

}