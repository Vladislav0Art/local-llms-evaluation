package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;

public class GeneratedConvertElementDocument_ReturnsNull {

    @Test
    public void convertElementDocument_ReturnsNull() {
        org.jsoup.nodes.Document inDoc = null;
        org.jsoup.nodes.Element inElem = new org.jsoup.nodes.Document();
        Document outDoc = W3CDom.convert(inElem, inDoc);
        assertNull(outDoc);
    }

}