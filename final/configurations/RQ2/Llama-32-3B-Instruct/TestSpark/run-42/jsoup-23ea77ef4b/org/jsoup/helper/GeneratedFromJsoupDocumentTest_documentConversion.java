package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedFromJsoupDocumentTest_documentConversion {

    @Test
    public void fromJsoupDocumentTest_documentConversion() {
        org.jsoup.nodes.Document in = new org.jsoup.nodes.Document();
        Document out = W3CDom.fromJsoup(in);
        assertNotNull(out);
    }

}