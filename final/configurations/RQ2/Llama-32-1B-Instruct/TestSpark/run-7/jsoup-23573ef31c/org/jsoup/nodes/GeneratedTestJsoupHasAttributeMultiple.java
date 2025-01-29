package org.jsoup.nodes;

public class GeneratedTestJsoupHasAttributeMultiple {

    @Test
    public void testJsoupHasAttributeMultiple() {
        String attrName1 = "test";
        String attrName2 = "other";
        boolean hasAttr1 = Jsoup.parse("<p>Hello, World!</p>", "", new TagFactory(false), new Attributes()).hasAttr(attrName1);
        boolean hasAttr2 = Jsoup.parse("<p>Hello, World!</p>", "", new TagFactory(false), new Attributes()).hasAttr(attrName2);
        assertTrue(hasAttr1 && hasAttr2);
    }

}