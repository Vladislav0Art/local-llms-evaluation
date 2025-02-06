package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

public class GeneratedConvertElementConvertsElement {

    @Test
    public void convertElementConvertsElement() {
        org.jsoup.nodes.Element inElem = new org.jsoup.nodes.Element();
        Document outDoc = new Document();
        W3CDom.convert(inElem, outDoc);
        assertNotNull(outDoc);
    }

}