package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_commentWithOutline {

    private static final String EMPTY_COMMENT = "#comment";
    private static final String DATA_COMMENT = "#comment> data</#comment>";
    private static final String XML_DECLARATION_DATA = "<!XML Declaration>";
    private static final String XML_DECLARATION_FRAGMENT = "<" + XML_DECLARATION_DATA + ">";
    private static final Document doc = new Document();
    private static final Comment comment = new Comment(DATA_COMMENT);

    @Test
    public void outerHtmlHead_commentWithOutline() throws IOException {
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();

        comment.outerHtmlHead(accum, depth, out);
        assertTrue(accum.toString().contains("<!--data-->"));
    }

}