package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedAsStringWithoutPropertiesTest {

    @Test
    public void asStringWithoutPropertiesTest() {
        Document wDoc = W3CDom.convert(new Document("Test Title"));
        String str = new W3CDom().asString(wDoc);

        assertNotNull(str);
        assertTrue(str.contains("Test Title"));
    }

}