package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.select.NodeTraversor;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

public class GeneratedConvert_AffectsDocument {

    @Test
    public void convert_AffectsDocument() {
        Document doc = Document.createDocumentBuilder().newDocument();
        W3CDom w3c = new W3CDom();
        Document out = w3c.convert(doc);
        assertNotNull(out);
    }

}