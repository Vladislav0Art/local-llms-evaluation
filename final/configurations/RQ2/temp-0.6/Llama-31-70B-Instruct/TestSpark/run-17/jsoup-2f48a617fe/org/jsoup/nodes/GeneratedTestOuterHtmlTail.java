package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

    private Comment comment;
    private String data;

    @Before
    public void setUp() {
        data = "This is a test.";
        comment = new Comment(data);
    }

    @Test
    public void testOuterHtmlTail() throws IOException {
        OutputSettings outputSettings = new OutputSettings();
        Document document = new Document("");

        StringWriter writer = new StringWriter();
        comment.outerHtmlTail(writer, 0, outputSettings);

        assertEquals("", writer.toString());
    }

}