package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedAsXmlDeclaration_setsCommentAsXmlDeclaration {

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
    public void asXmlDeclaration_setsCommentAsXmlDeclaration() throws IOException {
        String[] xmlDeclaration = {"<comment>", "</comment>"};
        Comment comment = new Comment(xmlDeclaration[0]);
        Comment asXmlComment = comment.asXmlDeclaration();
        assertEquals("<comment></comment>", asXmlComment.toString());
    }

}