package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        Document document = new Document();
        Appendable accum = new StringBuilder();

        Appender appender = new DefaultAppender(accum);
        appender.appendText("\n");
        document.addContent(appender, 0);

        assertEquals("Hello World", TextNode.outerHtmlHead(appender, 1, null));
    }

}