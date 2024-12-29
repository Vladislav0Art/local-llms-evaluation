package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        Document document = new Document();
        Appendable accum = document.createText("test");
        assertTrue(document.outerHtmlHead(0, "test", document.OutputSettings()).contains("test"));
    }

}