package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

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
    public void testOuterHtmlTail() {
        when(comment.outerHtmlTail(any(Appendable.class), any(int.class), any(Document.OutputSettings.class))).thenAnswer(invocation -> {
            Appendable appendable = invocation.getArgument(0);
            Document.OutputSettings settings = invocation.getArgument(1);
            return "";
        });
        assertEquals("", comment.outerHtmlTail(Appendable.class, 0, Document.OutputSettings.class));
    }

}