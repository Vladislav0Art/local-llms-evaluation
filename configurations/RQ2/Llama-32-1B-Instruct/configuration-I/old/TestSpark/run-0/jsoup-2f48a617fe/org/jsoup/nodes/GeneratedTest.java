package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;

public class GeneratedTest {

    @Test
    public void nodeNameMatches() {
        String data = "This is a test comment.";
        Comment comment = new Comment(data);
        assertEquals("comment", comment.nodeName());
    }

    @Test
    public void getDataReturnsCorrectContent() {
        String data = "This is a test comment.";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

    @Test
    public void setDataSetsCorrectAttribute() {
        String data = "This is a test comment.";
        Comment comment = new Comment(data);
        comment.setData("expected attribute value");
        assertEquals("expected attribute value", comment.getData());
    }

    @Test
    public void getOuterHtmlHeadReturnsCorrectContent() {
        // Stub the DocumentOutputSettings for testing purposes
        String[] expected = {"<root><comment>test</comment></root>", "<root><comment>expected <attribute>value</attribute></root>"};

        Comment comment = new Comment("");
        String result = comment.outerHtmlHead(new org.jsoup.nodes.Document(), 1, new org.jsoup.nodes.Document.OutputSettings());
        assertEquals(expected[0], result);
    }

    @Test
    public void getOuterHtmlTailReturnsCorrectContent() {
        // Stub the DocumentOutputSettings for testing purposes
        String[] expected = {"<root><comment>test</comment></root>", "<root><comment>expected <attribute>value</attribute></root>"};

        Comment comment = new Comment("");
        String result = comment.outerHtmlTail(new org.jsoup.nodes.Document(), 1, new org.jsoup.nodes.Document.OutputSettings());
        assertEquals(expected[0], result);
    }

    @Test
    public void toStringReturnsCorrectString() {
        // Stub the DocumentOutputSettings for testing purposes
        String[] expected = {"This is a test comment.", "expected <attribute>value</attribute>"};

        Comment comment = new Comment("");
        String actual = comment.toString();
        assertEquals(expected[0], actual);
    }

    @Test
    public void isXmlDeclarationReturnsFalse() {
        // Stub the DocumentOutputSettings for testing purposes
        String[] expected = {"<root><comment>test</comment></root>", "<root><comment>expected <attribute>value</attribute></root>"};

        Comment comment = new Comment("");
        boolean actual = comment.isXmlDeclaration();
        assertEquals(false, actual);
    }

    @Test
    public void asXmlDeclarationReturnsCorrectResult() {
        // Stub the DocumentOutputSettings for testing purposes
        String[] expected = {"<root><comment>test</comment></root>", "<root><comment>expected <attribute>value</attribute></root>"};

        Comment comment = new Comment("");
        Object result = comment.asXmlDeclaration();
        assertEquals(expected[0], (String) result);
    }

}