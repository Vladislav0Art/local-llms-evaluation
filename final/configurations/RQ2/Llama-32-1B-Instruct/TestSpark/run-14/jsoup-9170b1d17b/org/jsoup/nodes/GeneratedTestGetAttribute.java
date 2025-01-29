package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestGetAttribute {

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
    public void testGetAttribute() {
        String html = "<html><head><title>My Service Test</title></head><body><script>alert('Hello World!');</script></body></html>";
        Document document = generateDocument(html);

        MyService service = new MyService();
        Attr attribute = new Attr("attr2", "value2");
        element = document.getElementById("element");
        service.addAttribute(attribute);
        assertTrue(service.hasAttribute("attr2"));
        Attr attr = service.getAttribute("attr2");
        assertEquals("value2", attr.value);
    }

}