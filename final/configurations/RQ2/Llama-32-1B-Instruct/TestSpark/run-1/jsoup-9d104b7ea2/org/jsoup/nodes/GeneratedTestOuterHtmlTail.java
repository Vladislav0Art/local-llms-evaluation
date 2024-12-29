package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() {
        Document document = new Document();
        Appendable accum = document.createText("test");
        assertTrue(document.outerHtmlTail(0, "test", document.OutputSettings()).contains("test"));
    }

}