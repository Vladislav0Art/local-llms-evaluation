package org.jsoup.nodes;

public class GeneratedTestToString {

    private Comment comment;

    @Before
    public void setup() {
        comment = new Comment("<!-- This is a comment -->");
    }

    @Test
    public void testToString() {
        String expected = "<!-- This is a comment -->";
        Document doc = new Document();
        // Set up the document with an empty output settings.
        Appendable accum = doc.getAppendable();
        int depth = 0;
        out = ParseSettings.getParser().getOutputSettings();
        out.setIndentLevel(4);
        outerHtmlHead(accum, depth, out);
        outerHtmlTail(accum, depth, out);
        assertEquals(expected, ((DocumentOutput) accum).toString());
    }

}