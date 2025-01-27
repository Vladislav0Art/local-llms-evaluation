package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GeneratedConvertDocument_FromJsoup_ReturnsDocument {

    @Test
    public void convertDocument_FromJsoup_ReturnsDocument() {
        Document inDoc = new Document();
        Document outDoc = W3CDom.convert(inDoc);
        assertNotNull(outDoc);
        assertEquals(inDoc, outDoc);
    }

}