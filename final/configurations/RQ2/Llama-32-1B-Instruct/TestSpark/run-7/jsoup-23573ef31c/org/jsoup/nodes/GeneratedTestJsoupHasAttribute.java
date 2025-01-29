package org.jsoup.nodes;

public class GeneratedTestJsoupHasAttribute {

    @Test
    public void testJsoupHasAttribute() {
        String attrName = "test";
        boolean hasAttr = Jsoup.parse("<p>Hello, World!</p>", "", new TagFactory(false), new Attributes()).hasAttr(attrName);
        assertTrue(hasAttr);
    }

}