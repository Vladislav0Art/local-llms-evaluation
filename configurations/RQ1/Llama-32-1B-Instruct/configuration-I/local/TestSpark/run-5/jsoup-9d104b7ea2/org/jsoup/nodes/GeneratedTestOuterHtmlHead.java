package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    private static String html = "<p>  Hello World  </p>";

    @Test
    public void testOuterHtmlHead() {
        Document document = new Document();
        Appendable accum = document.newAppendable();

        outerHtmlHead(accum, 0, document.OutputSettings());

        assertEquals("<p>Hello World</p>", StringUtil.stripLines(accum.toString()));
    }

}