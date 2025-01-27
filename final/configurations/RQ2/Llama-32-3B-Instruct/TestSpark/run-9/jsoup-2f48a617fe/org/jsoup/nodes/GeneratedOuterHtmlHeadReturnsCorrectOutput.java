package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedOuterHtmlHeadReturnsCorrectOutput {

    @Test
    public void outerHtmlHeadReturnsCorrectOutput() throws IOException {
        Appendable accum = new StringBuilder();
        int depth = 1;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("test");
        comment.outerHtmlHead(accum, depth, out);
        assertEquals("<!-- test -->", accum.toString());
    }
}

class Appendable extends java.io.PrintWriter {
    public void append(String s) {
        super.print(s);
    }

    @Override
    protected void append(char c) {
        super.append(c);
    }

    @Override
    public void print(String s) {
        super.print(s);
    }

    @Override
    public void println() throws IOException {
        super.println();
    }
}

class Comment extends java.lang.Object {
    private String data;

    public Comment(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public Comment clone() {
        return new Comment(this.data);
    }

    @Override
    public String toString() {
        return "<!-- " + data + " -->";
    }

}