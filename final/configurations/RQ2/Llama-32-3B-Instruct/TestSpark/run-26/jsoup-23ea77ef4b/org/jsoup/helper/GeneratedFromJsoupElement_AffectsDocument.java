package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.select.NodeTraversor;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

public class GeneratedFromJsoupElement_AffectsDocument {

    @Test
    public void fromJsoupElement_AffectsDocument() {
        Document doc = Document.createDocumentBuilder().newDocument();
        Element elem = doc.createElement("div");
        Document result = W3CDom.fromJsoup(elem);
        assertNotNull(result);
    }

}