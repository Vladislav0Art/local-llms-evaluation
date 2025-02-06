package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

import java.util.HashMap;

public class GeneratedAsString_FromDocumentWithoutPropertiesTest {

    @Test
    public void asString_FromDocumentWithoutPropertiesTest() {
        Document doc = W3CDom.asString(doc, null);
        assertNotNull(doc);
    }

}