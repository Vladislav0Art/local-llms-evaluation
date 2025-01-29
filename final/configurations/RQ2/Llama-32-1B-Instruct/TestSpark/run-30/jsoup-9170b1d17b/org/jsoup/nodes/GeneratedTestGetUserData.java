package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestGetUserData {

    private static final String KEY = "test-key";
    private static final String VALUE = "test-value";

    @Before
    public void setup() {
        attributes1 = new Attributes();
        attributes2 = new Attributes();
    }

    @Test
    public void testGetUserData() {
        String userData = attributes2.getUserData(KEY);
        assertNotNull(userData);
    }

}