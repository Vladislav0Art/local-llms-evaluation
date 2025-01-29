package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestAddAttribute {

    public static Document generateDocument(String html) {
        // Simulate rendering the HTML document
        Document document = new Document();
        Elements elements = document.createElement("html").appendChild(document.createNode("body"));
        Element head = document.createElement("head");
        document.appendChild(head);
        element = document.createElement("title");
        element.text = "My Service Test";
        head.appendChild(element);

        elements = document.createElement("script")
                .appendChild(document.createTextNode("console.log('Hello World!');"))
                .appendChild(document.createElement("style"))
                .appendChild(document.createTextNode(".attribute { color: red; }"));
        elements.appendChild(head);
        return document;
    }

    @Test
    public void testAddAttribute() {
        String html = "<html><head><title>My Service Test</title></head><body><script>alert('Hello World!');</script></body></html>";
        Document document = generateDocument(html);

        MyService service = new MyService();
        Element element = document.getElementById("element");
        Attr attribute = new Attr("attr1", "value1");
        element.setAttribute(attribute);
        assertTrue(document.select(".attribute").size() == 1);
        assertEquals("value1", ((Attr) document.select(".attribute")[0].attr("value")).value);
    }

}