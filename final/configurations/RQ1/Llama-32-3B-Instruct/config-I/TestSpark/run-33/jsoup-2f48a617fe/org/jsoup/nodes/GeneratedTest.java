package org.jsoup.nodes;

public class GeneratedTest {

    private String html;

    public Document(String html) {
        this.html = html;
    }

    public void setHtml(String html) {
        this.html = html;
    }
}

public class Comment extends Document {
    private String data;

    public Comment(String data) {
        super(data);
        this.data = data;
    }

    @Override
    public String getData() {
        return data;
    }
}

public class Element extends Document {
    public void setOuterHtml(String outerHtml) {
        super.setHtml(outerHtml);
    }
}

public class GeneratedTest {

    @Before
    public void setUp() throws Exception {
        Document head = new Document("<html>");
        Element comment1 = new Comment("<!-- comment 1 -->");
        Element comment2 = new Comment("<!-- comment 2 -->");

        head.appendChild(comment1.outerHtml());
        head.appendChild(comment2.outerHtml());

        Document body = new Document("<body></body>");
        head.appendChild(body.outerHtml());

        Document div = new Document("<div>");
        body.appendChild(div.outerHtmlWithoutWrap());

        htmlString = head.outerHtml();
    }

    @Test
    public void createCommentFromEmptyStringCreatesBlankComment() {
        Comment comment = new Comment("");
        assertEquals("#comment", comment.nodeName());
        assertNull(comment.getData());
    }

    @Test
    public void createCommentWithTextSetsDataProperly() {
        Comment comment = new Comment("Some text");
        assertEquals("Some text", comment.getData());
    }

    @Test
    public void cloneCommentCreatesNewCopy() {
        Comment original = new Comment("Some text");
        Comment copy = original.clone();
        assertNotSame(original, copy);
        assertEquals("#comment", copy.nodeName());
        assertEquals("Some text", copy.getData());
    }

    @Test
    public void asXmlDeclarationReturnsNullForCommentWithoutDeclarationData() {
        Comment comment = new Comment("Some text");
        assertNull(comment.asXmlDeclaration());
    }

}