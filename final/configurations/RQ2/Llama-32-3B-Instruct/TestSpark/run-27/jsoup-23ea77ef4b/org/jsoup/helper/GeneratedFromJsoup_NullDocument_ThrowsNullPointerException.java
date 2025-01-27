package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class GeneratedFromJsoup_NullDocument_ThrowsNullPointerException {

    @Test
    public void fromJsoup_NullDocument_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> W3CDom.fromJsoup(null));
    }

}