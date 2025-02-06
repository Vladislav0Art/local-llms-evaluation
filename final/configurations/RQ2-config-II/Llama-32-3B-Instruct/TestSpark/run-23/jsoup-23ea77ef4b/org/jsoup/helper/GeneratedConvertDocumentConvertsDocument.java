package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

public class GeneratedConvertDocumentConvertsDocument {

    @Test
    public void convertDocumentConvertsDocument() {
        org.jsoup.nodes.Document inDoc = new org.jsoup.nodes.Document();
        Document outDoc = new Document();
        W3CDom.convert(inDoc, outDoc);
        assertNotNull(outDoc);
    }

}