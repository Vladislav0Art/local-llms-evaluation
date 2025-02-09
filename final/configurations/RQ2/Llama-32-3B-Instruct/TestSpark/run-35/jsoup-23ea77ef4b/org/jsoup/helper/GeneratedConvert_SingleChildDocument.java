package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayOutputStream;
import java.util.Map;

public class GeneratedConvert_SingleChildDocument {

    @Test
    public void convert_SingleChildDocument() {
        org.jsoup.nodes.Document document = new org.jsoup.nodes.Document();
        org.jsoup.nodes.Element child = document.createElement("child");
        document.appendChild(child);
        Document convertedDoc = W3CDom.convert(document);
        assertNotNull(convertedDoc);
    }

}