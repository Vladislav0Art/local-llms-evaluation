package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedAsXmlDeclarationFalseTest {

    @Test
    public void asXmlDeclarationFalseTest() throws IOException {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings(true, false);
        Comment comment = new Comment("Not XML");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNull(decl);
        // No output.
    }

}

public class Comment {

    private String data;

    public Comment(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String nodeName() {
        return "#comment";
    }

    public void outerHtmlHead(Appendable accum, int line, Document.OutputSettings out) {
        accum.append("<!--").append(data).append("-->\n");
    }

    public void outerHtmlTail(Appendable accum, int line, Document.OutputSettings out) {
    }

    public void outerHtml(Appendable accum, int line, Document.OutputSettings out) {
        outerHtmlHead(accum, line, out);
        outerHtmlTail(accum, line, out);
    }

    public Comment clone() {
        return new Comment(data);
    }

    public boolean isXmlDeclaration() {
        return data.startsWith("!XML");
    }

    public XmlDeclaration asXmlDeclaration() {
        return null;
    }
}

public class Document {

    public static class OutputSettings {
        private boolean doHead;

        public void setDoHead(boolean doHead) {
            this.doHead = doHead;
        }

        public OutputSettings doHead(boolean doHead) {
            this.doHead = doHead;
            return this;
        }
    }
}

}