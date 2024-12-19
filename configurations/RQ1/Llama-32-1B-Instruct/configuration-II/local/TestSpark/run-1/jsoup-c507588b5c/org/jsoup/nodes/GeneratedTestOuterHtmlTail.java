package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() {
        Document document = new Document();
        Appendable accum = new StringBuilder();

        Appender appender = new DefaultAppender(accum);
        appender.appendText("\n");
        document.addContent(appender, 0);

        assertEquals("", TextNode.outerHtmlHead(appender, 1, null).toString());
    }

}