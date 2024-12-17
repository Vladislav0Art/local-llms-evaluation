package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

public class GeneratedOuterHtmlHead_withPrettyPrint_setsDepthAndAccum {

    private Appendable accum = new StringBuilder();

    public Comment() {
    }

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

    public void testOuterHtmlHead() throws IOException {
        doThrow(new IOException()).when(accum).append(any());
        Comment(comment, accum);
        assertEquals(1, accum.depth());
        assertEquals(this, accum);
    }

    @Test
    public void outerHtmlHead_withPrettyPrint_setsDepthAndAccum() throws IOException {
        testOuterHtmlHead();
    }

    public static String getComment(String data) {
        return "#comment" + "\n<!--" + data + "-->";
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