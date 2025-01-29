package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedTest {

    @Override
    public String nodeName() {
        return "Comment";
    }

    @Override
    public String getData() {
        return null;
    }

    @Override
    public void outerHtmlHead(Appendable accum, int depth, Document.OutputSettings out) throws IOException {
        accum.append("");
    }

    @Override
    public void outerHtmlTail(Appendable accum, int depth, Document.OutputSettings out) {
        accum.append("");
    }

    @Override
    public String toString() {
        return "This is a test comment";
    }

    @Override
    public Comment clone() {
        return new Comment(data);
    }

    public boolean isXmlDeclaration() {
        return false;
    }

    public @Nullable XmlDeclaration asXmlDeclaration() {
        return null;
    }
}

public class CommentTest {

    private Comment comment;

    @Before
    public void setup() {
        ParseSettings settings = new ParseSettings();
        Parser parser = new Parser(settings);
        String data = "This is a test comment";
        comment = new Comment(data);
    }

    @Test
    public void nodeNameTests() {
        assertEquals("Comment", comment.nodeName());
    }

    @Test
    public void getDataTests() {
        assertEquals(null, comment.getData());
    }

    @Test
    public void setDataTests() {
        comment.setData("This is a test comment");
        assertEquals("This is a test comment", comment.getData());
    }

    @Test
    public void outerHtmlHeadTests() throws IOException {
        Document document = new Document();
        Appendable accum = document.newAppendable();
        comment.outerHtmlHead(accum, 0, ParseSettings.EMPTY);
        assertEquals("", accum.toString());
    }

    @Test
    public void outerHtmlTailTests() throws IOException {
        Document document = new Document();
        Appendable accum = document.newAppendable();
        comment.outerHtmlTail(accum, 0, ParseSettings.EMPTY);
        assertEquals("", accum.toString());
    }

    @Test
    public void toStringTests() {
        assertEquals("This is a test comment", comment.toString());
    }

    @Test
    public void cloneTests() throws Exception {
        Comment clonedComment = (Comment) comment.clone();
        assertEquals(comment, clonedComment);
    }

}