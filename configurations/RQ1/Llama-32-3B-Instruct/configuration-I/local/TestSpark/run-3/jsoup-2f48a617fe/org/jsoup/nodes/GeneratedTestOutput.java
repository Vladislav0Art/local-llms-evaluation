package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;

public class GeneratedTestOutput {

    @Test
    public void testOutput() throws Exception {
        Document document = new Document("html", null, "UTF-8");
        Comment comment = new Comment("Hello World!");
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings outSettings = new Document.OutputSettings();
        comment.outerHtmlHead(accum, depth, outSettings);
        comment.outerHtmlTail(accum, depth, outSettings);
    }
}

public class Comment {
    private String data;

    public Comment(String data) {
        this.data = data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void outerHtmlHead(Appendable accum, int depth, Document.OutputSettings outSettings) throws Exception {
        // implementation
    }

    public void outerHtmlTail(Appendable accum, int depth, Document.OutputSettings outSettings) throws Exception {
        // implementation
    }
}

public class Document {
    private String html;
    private String encoding;

    public Document(String html, String encoding, String encodingType) {
    }

    public static Document fromString(String html) {
        return new Document(html, null, "UTF-8");
    }

    public Appendable append(appendable accum) throws Exception {
    }
}

public class OutputSettings {
    public boolean useOuterHtml;

    public void setUseOuterHtml(boolean useOuterHtml) {
        this.useOuterHtml = useOuterHtml;
    }

}