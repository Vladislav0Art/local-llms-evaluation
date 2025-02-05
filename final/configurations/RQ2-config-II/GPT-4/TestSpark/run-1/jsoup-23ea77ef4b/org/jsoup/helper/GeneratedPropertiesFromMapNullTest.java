package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;

import java.util.HashMap;

import static org.junit.Assert.*;

public class GeneratedPropertiesFromMapNullTest {

    @Test
    public void propertiesFromMapNullTest() {
        assertNull(W3CDom.propertiesFromMap(null));
    }

}