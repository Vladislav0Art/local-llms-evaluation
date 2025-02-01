package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attribute;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.transform.OutputKeys;
import java.util.HashMap;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

public class GeneratedAsStringTest {

    @Test
    public void asStringTest() {
        org.jsoup.nodes.Document jsoupDocument = Jsoup.parse("<html><body><div>Test</div></body></html>");
        Document w3cDocument = W3CDom.convert(jsoupDocument);
        String strDocument = W3CDom.asString(w3cDocument);
        assertTrue(strDocument.contains("<div>Test</div>"));
    }

}