package org.jsoup.helper;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.xml.transform.TransformerException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedAsStringPropertiesTest {

    @Test
    public void asStringPropertiesTest() throws TransformerException {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body>Testing</body></html>");
        Document target = W3CDom.convert(jsoupDoc);

        //try with null map
        assertNotNull(W3CDom.asString(target, null));

        //try with html map
        Map<String, String> mapHtml = W3CDom.OutputHtml();
        assertNotNull(W3CDom.asString(target, mapHtml));

        //try with xml map
        Map<String, String> mapXml = W3CDom.OutputXml();
        assertNotNull(W3CDom.asString(target, mapXml));
    }

}