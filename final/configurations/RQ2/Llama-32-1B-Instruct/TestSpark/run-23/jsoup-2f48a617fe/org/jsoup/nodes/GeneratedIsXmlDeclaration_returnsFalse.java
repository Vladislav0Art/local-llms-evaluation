package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedIsXmlDeclaration_returnsFalse {

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
    public void isXmlDeclaration_returnsFalse() {
        Comment comment = new Comment("<test>");
        assertFalse(comment.isXmlDeclaration());
    }

}