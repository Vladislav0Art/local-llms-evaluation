package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

    private static String html = "<p>  Hello World  </p>";

    @Test
    public void testOuterHtmlTail() {
        Document document = new Document();
        Appendable accum = document.newAppendable();

        outerHtmlTail(accum, 0, document.OutputSettings());

        assertEquals("<p>Hello World</p>", StringUtil.stripLines(accum.toString()));
    }

}