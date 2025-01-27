package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;

public class GeneratedFromJsoupDocument_ReturnsDocument {

    @Test
    public void fromJsoupDocument_ReturnsDocument() {
        Document inDoc = null;
        Document outDoc = W3CDom.fromJsoup(inDoc);
        assertNotNull(outDoc);
    }

}