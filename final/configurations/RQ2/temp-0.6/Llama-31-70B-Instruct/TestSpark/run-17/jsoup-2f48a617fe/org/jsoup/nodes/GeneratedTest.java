package org.jsoup.nodes;

public class GeneratedTest {

    private Comment comment;
    private String data;

    @Before
    public void setUp() {
        data = "This is a test.";
        comment = new Comment(data);
    }

    @Test
    public void testNodeName() {
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void testGetData() {
        assertEquals(data, comment.getData());
    }

    @Test
    public void testSetData() {
        String newData = "New data.";
        comment.setData(newData);
        assertEquals(newData, comment.getData());
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

    @Test
    public void testOuterHtmlTail() throws IOException {
        OutputSettings outputSettings = new OutputSettings();
        Document document = new Document("");

        StringWriter writer = new StringWriter();
        comment.outerHtmlTail(writer, 0, outputSettings);

        assertEquals("", writer.toString());
    }

    @Test
    public void testToString() {
        assertEquals("<!--" + data + "-->", comment.toString());
    }

    @Test
    public void testClone() {
        Comment clone = comment.clone();
        assertNotSame(comment, clone);
        assertEquals(comment.getData(), clone.getData());
    }

    @Test
    public void testIsXmlDeclaration() {
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void testAsXmlDeclaration() {
        assertNull(comment.asXmlDeclaration());
    }

}