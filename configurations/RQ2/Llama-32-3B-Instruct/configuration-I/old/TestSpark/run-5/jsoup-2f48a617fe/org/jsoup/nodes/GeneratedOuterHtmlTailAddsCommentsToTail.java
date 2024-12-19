package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedOuterHtmlTailAddsCommentsToTail {

    @Test
    public void outerHtmlTailAddsCommentsToTail() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Document document = new Document("", outContent);
        Comment comment = new Comment("Hello World");
        Appendable append = new StringBuilder().append(document.outerHtml()).append("</html>");
        comment.outerHtmlTail(append, 0, null);
        assertEquals("<html><comment>Hello World</comment></html>", outContent.toString());
    }

    public static class Comment {
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
            return "comment";
        }

        public void outerHtmlHead(Appendable append, int index, Document.OutputSettings settings) {
            // implement method
        }

        public void outerHtmlTail(Appendable append, int index, Document.OutputSettings settings) {
            // implement method
        }
    }

    public static class Document {
        private StringBuilder content;

        public Document(String content) {
            this.content = new StringBuilder(content);
        }

        public String outerHtml() {
            return "<html>" + content.toString() + "</html>";
        }

        public Appendable outerHtmlHead(Appendable append, int index, OutputSettings settings) {
            // implement method
            return append;
        }

        public Appendable outerHtmlTail(Appendable append, int index, Document.OutputSettings settings) {
            // implement method
            return append;
        }
    }

    public static class OutputSettings {
        // implement settings
    }

}