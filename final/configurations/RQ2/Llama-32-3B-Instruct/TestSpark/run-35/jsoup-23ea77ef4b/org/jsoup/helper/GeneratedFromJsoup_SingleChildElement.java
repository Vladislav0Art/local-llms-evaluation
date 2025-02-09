package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayOutputStream;
import java.util.Map;

public class GeneratedFromJsoup_SingleChildElement {

    @Test
    public void fromJsoup_SingleChildElement() {
        Element element = Element.of("html");
        Document convertedDoc = W3CDom.fromJsoup(element);
        assertNotNull(convertedDoc);
    }

}