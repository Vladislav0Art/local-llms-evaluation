package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

import java.util.HashMap;

public class GeneratedFromJsoup_FromDocumentTest {

    @Test
    public void fromJsoup_FromDocumentTest() {
        Document in = new Document();
        Document out = W3CDom.fromJsoup(in);
        assertNotNull(out);
    }

}