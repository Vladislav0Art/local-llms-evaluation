package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.select.NodeTraversor;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

public class GeneratedAsString_AffectsDocument {

    @Test
    public void asString_AffectsDocument() {
        Document doc = Document.createDocumentBuilder().newDocument();
        String result = W3CDom.asString(doc, null);
        assertNotNull(result);
    }

}