package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedAsStringFromDocumentWithoutPropertiesTest {

    @Test
    public void asStringFromDocumentWithoutPropertiesTest() {
        Document doc = new org.jsoup.nodes.Document();

        String result = W3CDom.asString(doc, null);

        assertNotNull(result);
    }

}