package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import java.io.IOException;

public class GeneratedTestComment {

    public Comment(String data) { /* implementation */ }

    public String nodeName() {
        return "Comment";
    }

    public String getData() {
        return "Data";
    }

    public Comment setData(String data) {
        return new Comment(data);
    }

    @Override
    void outerHtmlHead(Appendable accum, int depth, Document.OutputSettings out) throws IOException {
        String comment = "<!-- " + nodeName() + " -->\n" + getData();
        out.append(comment);
    }

    @Override
    void outerHtmlTail(Appendable accum, int depth, Document.OutputSettings out) {
    }

    @Override
    public String toString() {
        return nodeName() + ": " + getData();
    }

    @Override
    public Comment clone() {
        return new Comment(data());
    }

    public boolean isXmlDeclaration() {
        return false;
    }

    public @Nullable XmlDeclaration asXmlDeclaration() {
        return null;
    }
}

public class CommentTest {

    private ParseSettings parseSettings;

    public void setup() throws IOException {
        parseSettings = ParseSettings.getDefaultInstance();
    }

    public void teardown() {
        parseSettings.release();
    }

    @Test
    public void testComment() {
		.Comment comment = new Comment("This is a comment");
        CommentCommentCommentTest(comment, "Data", null);
    }

}