package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestAdd {

    public static Document generateAttributes() {
        Document doc = new Document();
        Element element = doc.createElement("div");
        element.setAttribute("class", "attributes");
        doc.appendChild(element);
        return doc;
    }

    @Test
    public void testAdd() {
        Document document = generateAttributes();
        Element element = doc.createElement("div");
        element.setAttribute("class", "attributes");

        element.appendChild(doc.createElement("p")).setAttribute("id", "key-1").nodeValue("value1");
        element.appendChild(doc.createElement("p")).setAttribute("id", "key-2").nodeValue("value2");

        document.getElementById("attributes").appendChild(element);
    }

}