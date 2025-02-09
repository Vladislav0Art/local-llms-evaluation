package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedConvertDocumentElementTest {

    @Test
    public void convertDocumentElementTest() {
        org.jsoup.nodes.Document inDoc = new org.jsoup.nodes.Document();
        org.jsoup.nodes.Element inElement = new org.jsoup.nodes.Element();
        Document outDoc = W3CDom.convert(inDoc, inElement);

        assertNotNull(outDoc);
    }

}