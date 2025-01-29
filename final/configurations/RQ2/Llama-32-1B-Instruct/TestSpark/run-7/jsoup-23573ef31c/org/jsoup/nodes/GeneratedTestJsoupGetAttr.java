package org.jsoup.nodes;

public class GeneratedTestJsoupGetAttr {

    @Test
    public void testJsoupGetAttr() {
        String attrValue = Jsoup.parse("<p>Hello, World!</p>").attr("author");
        assertEquals("John Doe", attrValue);
    }

}