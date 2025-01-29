package org.jsoup.nodes;

public class GeneratedTestJsoupSetAttr {

    @Test
    public void testJsoupSetAttr() {
        Jsoup.parse("<div id='test' class='class1'></div>", "", new TagFactory(true), new Attributes());
        assertEquals("Hello, World!", Jsoup.parse("<div id='test' class='class1'></div>").attr("author", "John Doe"));
    }

}