package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedConvertFromDocumentTest {

    @Test
    public void convertFromDocumentTest() {
        org.jsoup.nodes.Document inDoc = new org.jsoup.nodes.Document();
        Document outDoc = W3CDom.convert(inDoc);

        assertNotNull(outDoc);
    }

}