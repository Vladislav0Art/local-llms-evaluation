package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.ParserBase;

public class GeneratedHtml_ReturnsHtmlString {

    @Test
    public void html_ReturnsHtmlString() {
        Attributes attributes = new Attributes();
        attributes.put("test", "value");
        Document document = new Document();
        Map<String, String> map = new HashMap<>();
        map.put("test", attributes.html());
        document.add(1, "html", map);
        assertTrue(document.containsString(attributes.html()));
    }

}