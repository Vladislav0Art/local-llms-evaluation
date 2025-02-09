package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

public class GeneratedAsString_FromW3CDocumentWithoutPropertiesWillReturnEmptyString {

    @Test
    public void asString_FromW3CDocumentWithoutPropertiesWillReturnEmptyString() {
        Document doc = new Document();
        assertEquals("", W3CDom.asString(doc, null));
    }

}