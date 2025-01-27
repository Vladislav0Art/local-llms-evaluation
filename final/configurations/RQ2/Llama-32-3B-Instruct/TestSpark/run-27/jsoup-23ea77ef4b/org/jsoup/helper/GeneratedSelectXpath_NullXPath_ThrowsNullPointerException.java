package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class GeneratedSelectXpath_NullXPath_ThrowsNullPointerException {

    @Test
    public void selectXpath_NullXPath_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> W3CDom.selectXpath(null));
    }

}