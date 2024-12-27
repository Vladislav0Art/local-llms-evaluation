package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedPutUserDataTest {

    @Test
    public void putUserDataTest() {
        Attributes attributes = new Attributes();
        assertEquals(attributes, attributes.putUserData("key", "value"));
    }

}