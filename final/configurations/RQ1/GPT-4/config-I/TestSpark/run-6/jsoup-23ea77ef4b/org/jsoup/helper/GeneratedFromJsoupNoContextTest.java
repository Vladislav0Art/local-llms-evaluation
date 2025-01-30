package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathFactory;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedFromJsoupNoContextTest {

    @Test
    public void fromJsoupNoContextTest() throws Exception {
        String html = "<div><p>hello world</p></div>";
        Document doc = new W3CDom().fromJsoup(org.jsoup.Jsoup.parse(html));
        assertNotNull(doc.getElementsByTagName("p").item(0));
    }

}