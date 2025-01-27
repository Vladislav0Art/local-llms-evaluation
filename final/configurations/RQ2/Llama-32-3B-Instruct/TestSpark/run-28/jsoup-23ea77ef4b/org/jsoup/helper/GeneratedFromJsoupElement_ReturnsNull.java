package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;

public class GeneratedFromJsoupElement_ReturnsNull {

    @Test
    public void fromJsoupElement_ReturnsNull() {
        org.jsoup.nodes.Element inElem = null;
        Document outDoc = W3CDom.fromJsoup(inElem);
        assertNull(outDoc);
    }

}