package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTest {

    @Test
    public void CommentConstructorTest() {
        String data = "This is a comment";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

    @Test
    public void CommentNodeNameTest() {
        Comment comment = new Comment("");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void CommentDataGetterSetterTest() {
        String data = "This is a comment";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
        comment.setData("Another comment");
        assertEquals("Another comment", comment.getData());
    }

    public void testOuterHtmlHead throws

    IOException {
        ByteArrayOutputStream accum = new ByteArrayOutputStream();
        Document.OutputSettings out = new Document.OutputSettings();

        // Mock implementation for outerHtmlHead
        Accumulator accumulator = new Accumulator(accum);
        Comment comment = new Comment("");
        comment.outerHtmlHead(accumulator, 0, out);

        assertEquals("<!-- comment -->", accum.toString());
    }

    public void testOuterHtmlTail throws

    IOException {
        ByteArrayOutputStream accum = new ByteArrayOutputStream();
        Document.OutputSettings out = new Document.OutputSettings();

        // Mock implementation for outerHtmlTail
        Appendable appendable = new Appendable() {
            @Override
            public String toString() {
                return "";
            }
        };
        Comment comment = new Comment("");
        comment.outerHtmlTail(appendable, 0, out);

        assertEquals("", accum.toString());
    }

    @Test
    public void CommentCloneTest() throws Exception {
        Comment comment = new Comment("This is a comment");
        Comment clonedComment = (Comment) comment.clone();
        assertNotNull(clonedComment);
        assertEquals(comment.getData(), clonedComment.getData());
    }

    @Test
    public void CommentIsXmlDeclarationTest() {
        Comment comment1 = new Comment("");
        assertTrue(comment1.isXmlDeclaration());

        Comment comment2 = new Comment("This is not an XML Declaration");
        assertFalse(comment2.isXmlDeclaration());

        Comment comment3 = new Comment("!XML Declaration");
        assertTrue(comment3.isXmlDeclaration());
    }

    @Test
    public void CommentAsXmlDeclarationTest() {
        Comment comment1 = new Comment("");
        assertNull(comment1.asXmlDeclaration());

        Comment comment2 = new Comment("This is not an XML Declaration");
        assertNull(comment2.asXmlDeclaration());

        Comment comment3 = new Comment("!XML Declaration");
        assertNotNull(comment3.asXmlDeclaration());
    }
}

class Document {
    public class OutputSettings {
        private boolean prettyPrint;

        public void setPrettyPrint(boolean prettyPrint) {
            this.prettyPrint = prettyPrint;
        }

        public boolean isPrettyPrint() {
            return prettyPrint;
        }
    }
}

class Accumulator implements Appendable {
    ByteArrayOutputStream output;

    public Accumulator(ByteArrayOutputStream out) {
        this.output = out;
    }

    @Override
    public String toString() {
        return output.toString();
    }

    @Override
    public void append(CharSequence csq, int start, int end) {
        output.append(csq);
    }
}

}