package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    private Comment comment;
    private String data;

    @Before
    public void setUp() {
        data = "This is a test.";
        comment = new Comment(data);
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        OutputSettings outputSettings = new OutputSettings();
        outputSettings.prettyPrint(true);
        outputSettings.outline(false);
        Document document = new Document("");

        StringWriter writer = new StringWriter();
        comment.outerHtmlHead(writer, 0, outputSettings);

        String expected = "<!--" + data + "-->";
        assertEquals(expected, writer.toString());
    }

}