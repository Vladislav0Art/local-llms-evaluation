package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.parser.ParseSettings;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

public class GeneratedGetUserDataTest {

    private Attributes attributes;
    private Attribute attribute;
    private ParseSettings parseSettings;

    @Before
    public void setUp() {
        attributes = new Attributes();
        attribute = new Attribute("test", "test");
        parseSettings = new ParseSettings(false, false);
    }

    @Test
    public void GetUserDataTest() {
        assertNull(attributes.getUserData("test"));
    }

}