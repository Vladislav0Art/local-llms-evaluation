package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

public class GeneratedAsString_FromW3CDocumentWithPropertiesWillReturnProperString {

    @Test
    public void asString_FromW3CDocumentWithPropertiesWillReturnProperString() {
        String propertiesStr = "property1=value1, property2=value2";
        Document doc = new Document();
        doc.setProperty("property1", "value1");
        doc.setProperty("property2", "value2");
        assertEquals("value1, value2", W3CDom.asString(doc, null));
    }

}