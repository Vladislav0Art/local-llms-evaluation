package org.jsoup.nodes;

public class GeneratedTestAsXmlDeclaration {

    private MockComment comment;

    @Before
    public void setUp() {
        when(comment = new MockComment()).thenReturn(new MockParser());
    }

    public void testCommentToString() {
        comment = new Comment("This is a sample comment.");
        when(comment.toString()).thenCallRealMethod();
        assertEquals("This is a sample comment.", comment.toString());
    }

    public void testGetNodeName() {
        comment = new Comment("This is a sample comment.");
        when(comment.nodeName()).thenReturn("comment");
        assertEquals("comment", comment.nodeName());
    }

    public void testGetData() {
        comment = new Comment("This is a sample comment.");
        when(comment.getData()).thenCallRealMethod();
        assertEquals("sample data", comment.getData());
    }

    public void testSetData() {
        comment = new Comment("This is a sample comment.");
        when(comment.setData()).thenReturn("sample data");
        comment = new Comment("New sample comment.");
        assertEquals("sample data", comment.getData());
    }

    @Test
    public void testAsXmlDeclaration() {
        when(comment.asXmlDeclaration()).thenAnswer(invocation -> null);
        assertEquals(null, comment.asXmlDeclaration());
    }
}

public class MockComment extends Comment {
    private Appendable accum;

    public MockComment() {
        this.accum = new StringBuilder();
    }

    @Override
    public void append(CharSequence csq) {
        if (csq != null) {
            this.accum.append(csq.toString());
        }
    }

}