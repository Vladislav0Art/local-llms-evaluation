package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayOutputStream;
import java.util.Map;

public class GeneratedConvert_SingleChildElement {

    @Test
    public void convert_SingleChildElement() {
        Element element = Element.of("html", "body", "child");
        Document convertedDoc = W3CDom.fromJsoup(element);
        assertNotNull(convertedDoc);
    }

}