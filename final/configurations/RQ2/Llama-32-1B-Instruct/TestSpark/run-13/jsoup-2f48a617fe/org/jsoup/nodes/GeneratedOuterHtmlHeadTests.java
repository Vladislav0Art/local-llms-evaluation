package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedOuterHtmlHeadTests {

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
    public void outerHtmlHeadTests() throws IOException {
        Document document = new Document();
        Appendable accum = document.newAppendable();
        comment.outerHtmlHead(accum, 0, ParseSettings.EMPTY);
        assertEquals("", accum.toString());
    }

}