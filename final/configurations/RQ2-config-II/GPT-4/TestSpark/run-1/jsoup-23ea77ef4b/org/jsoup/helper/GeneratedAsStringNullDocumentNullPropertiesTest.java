package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;

import java.util.HashMap;

import static org.junit.Assert.*;

public class GeneratedAsStringNullDocumentNullPropertiesTest {

    @Test
    public void asStringNullDocumentNullPropertiesTest() {
        assertNull(W3CDom.asString(null, null));
    }

}