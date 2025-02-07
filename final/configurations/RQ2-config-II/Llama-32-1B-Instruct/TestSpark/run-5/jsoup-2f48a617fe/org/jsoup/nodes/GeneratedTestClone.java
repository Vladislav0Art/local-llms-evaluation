package org.jsoup.nodes;

public class GeneratedTestClone {

    private Comment comment;

    @Before
    public void setup() {
        comment = new Comment("<!-- This is a comment -->");
    }

    @Test
    public void testClone() {
        String expected = "<!-- This is a comment -->";
        Document doc = new Document();
        // Set up the document with an empty output settings.
        Appendable accum = doc.getAppendable();
        int depth = 0;
        out = ParseSettings.getParser().getOutputSettings();
        outerHtmlHead(accum, depth, out);
        outerHtmlTail(accum, depth, out);
        Document otherDoc = (Document) comment.clone();
        assertEquals(expected, otherDoc.toString());
    }

}