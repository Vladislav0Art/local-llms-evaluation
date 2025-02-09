package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedFromJsoupDocumentTest {

    @Test
    public void fromJsoupDocumentTest() {
        org.jsoup.nodes.Document inDoc = new org.jsoup.nodes.Document();
        Document outDoc = W3CDom.fromJsoup(inDoc);

        assertNotNull(outDoc);
    }

}