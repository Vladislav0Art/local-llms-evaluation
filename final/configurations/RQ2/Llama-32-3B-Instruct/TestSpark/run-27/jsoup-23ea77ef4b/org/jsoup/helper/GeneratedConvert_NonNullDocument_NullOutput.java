package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class GeneratedConvert_NonNullDocument_NullOutput {

    @Test
    public void convert_NonNullDocument_NullOutput() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        W3CDom.convert(doc, null);
    }

}