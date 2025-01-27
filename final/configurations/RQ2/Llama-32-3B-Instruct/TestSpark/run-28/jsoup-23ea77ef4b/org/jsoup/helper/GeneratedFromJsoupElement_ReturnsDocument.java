package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;

public class GeneratedFromJsoupElement_ReturnsDocument {

    @Test
    public void fromJsoupElement_ReturnsDocument() {
        org.jsoup.nodes.Element inElem = null;
        Document outDoc = W3CDom.fromJsoup(inElem);
        assertNotNull(outDoc);
    }

}