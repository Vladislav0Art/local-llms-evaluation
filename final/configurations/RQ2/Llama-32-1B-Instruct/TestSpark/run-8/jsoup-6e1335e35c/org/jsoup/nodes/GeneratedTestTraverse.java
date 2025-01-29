package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestTraverse {

    @Test
    public void testTraverse() {
        Document document = new Document();
        Element element = document.createElement("html");
        document.appendChild(element);
        String html = "<p>Hello World!</p><span>This is a test</span>";
        parser.parseString(html, element);
        assertTrue(element.traverse(new java.util.function.Consumer<Element>() {
            @Override
            public void accept(Element node) {
                System.out.println(node.getTagName());
            }
        }));
    }

}