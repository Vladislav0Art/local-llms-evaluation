package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.select.NodeTraversor;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

public class GeneratedFromJsoup_AffectsDocument {

    @Test
    public void fromJsoup_AffectsDocument() {
        Document doc = Document.createDocumentBuilder().newDocument();
        Document result = W3CDom.fromJsoup(doc);
        assertNotNull(result);
    }

}