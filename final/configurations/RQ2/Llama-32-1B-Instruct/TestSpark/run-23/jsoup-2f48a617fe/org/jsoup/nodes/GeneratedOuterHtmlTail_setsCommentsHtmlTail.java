package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedOuterHtmlTail_setsCommentsHtmlTail {

    private String data;

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public boolean isXmlDeclaration() {
        return false;
    }

    @Nullable
    public XmlDeclaration asXmlDeclaration() {
        return null;
    }

    @Override
    public void outerHtmlHead(Appendable accum, int depth, Document.OutputSettings out) throws IOException {
        // Empty implementation
    }

    @Override
    public String toString() {
        return data;
    }
}

public class CommentTest {

    @Test
    public void outerHtmlTail_setsCommentsHtmlTail() throws IOException {
        String[] htmlTail = {"<html><head></head>", "<body></body>"};
        Comment comment = new Comment(htmlTail[0]);
        comment.outerHtmlTail(null, 1, null);
        assertEquals("<html><head></head><body></body>", comment.outerHtmlTail().toString());
    }

}