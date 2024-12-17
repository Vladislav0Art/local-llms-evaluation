package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedTestOuterHtmlHead {

    private Appendable accum = new StringBuilder();

    public Comment(String data) {
        this.accum.append(data);
    }

    public void append(String data) throws IOException {
        doThrow(new IOException()).when(accum).append(any());
        accum.append(data);
    }

    public void outerHtmlHead(Appendable accum, int depth) {
        if (depth == 0) return;
        Comment(comment, accum);
        accum.append("<!--");
    }

    private static String getComment(String data) {
        return "#comment" + "\n<!--" + data + "-->";
    }

    public String getData() {
        return accum.toString();
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        doThrow(new IOException()).when(accum).append(any());
        Comment comment = new Comment("Hello");
        comment.outerHtmlHead(accum, 1);
        assertEquals(1, accum.depth());
        assertEquals(comment, accum);
    }
}

class Document {
}

class Parser {

    public static Parser htmlParser() {
        return new Parser();
    }

    class Settings {
    }

    class ParseSettings extends Settings {
    }

    class ParseOptions {
    }

    class DocumentBuilder {
    }
}

class XmlDeclaration {

    private String tag;

    public XmlDeclaration(String tag) {
        this.tag = tag;
    }

}