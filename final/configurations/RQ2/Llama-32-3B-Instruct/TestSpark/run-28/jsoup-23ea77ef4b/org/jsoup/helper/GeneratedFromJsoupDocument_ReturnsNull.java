package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;

public class GeneratedFromJsoupDocument_ReturnsNull {

    @Test
    public void fromJsoupDocument_ReturnsNull() {
        Document inDoc = null;
        Document outDoc = W3CDom.fromJsoup(inDoc);
        assertNull(outDoc);
    }

}