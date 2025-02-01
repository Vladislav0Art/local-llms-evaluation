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

public class GeneratedConvertTest {

    @Test
    public void convertTest() {
        org.jsoup.nodes.Document jsoupDocument = Jsoup.parse("<html><body><div>Text1</div><div>Text2</div></body></html>");
        Document w3cDocument = W3CDom.convert(jsoupDocument);
        assertEquals("html", w3cDocument.getDocumentElement().getTagName());
    }

}