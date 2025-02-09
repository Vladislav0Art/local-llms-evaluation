package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayOutputStream;
import java.util.Map;

public class GeneratedFromJsoup_EmptyDocument {

    @Test
    public void fromJsoup_EmptyDocument() {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Document convertedDoc = W3CDom.fromJsoup(document);
        assertNotNull(convertedDoc);
    }

}