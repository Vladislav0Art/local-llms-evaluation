package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

public class GeneratedFromJsoup convertsDocument {

    @Test
    public void fromJsoup

    convertsDocument() {
        org.jsoup.nodes.Document inDoc = new org.jsoup.nodes.Document();
        Document outDoc = W3CDom.fromJsoup(inDoc);
        assertEquals(inDoc, outDoc);
    }

}