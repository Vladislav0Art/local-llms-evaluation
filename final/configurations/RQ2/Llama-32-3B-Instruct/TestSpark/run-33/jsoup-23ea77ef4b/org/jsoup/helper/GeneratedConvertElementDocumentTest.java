package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedConvertElementDocumentTest {

    @Test
    public void convertElementDocumentTest() {
        org.jsoup.nodes.Element inElement = new org.jsoup.nodes.Element();
        Document outDoc = W3CDom.convert(inElement);

        assertNotNull(outDoc);
    }

}