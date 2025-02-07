package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedShould_add_comment_to_html_head {

    public Comment(String data) { /* implementation */ }

    public String nodeName() {
        return "Comment";
    }

    public String getData() {
        return null;
    }

    public Comment setData(String data) {
        return this;
    }

    @Override
    void outerHtmlHead(Appendable accum, int depth, Document.OutputSettings out) throws IOException {
        if (depth > 0) {
            out.append("<!--");
            for (String line : getLines()) {
                out.append(line).append("\n");
            }
            out.append("-->");
        } else {
            out.append("<!--");
            out.append("<!--");
            for (String line : getLines()) {
                out.append(line).append("\n");
            }
            out.append("-->");
        }
    }

    @Override
    void outerHtmlTail(Appendable accum, int depth, Document.OutputSettings out) {
    }

    @Override
    public String toString() {
        List<String> lines = new ArrayList<>();
        lines.add("<Comment>");
        if (getData() != null) {
            lines.add(getData());
        }
        for (String line : getLines()) {
            lines.add(line);
        }
        lines.add("</Comment>");
        return String.join("\n", lines);
    }

    @Override
    public Comment clone() {
        return this;
    }

    public boolean isXmlDeclaration() {
        return false;
    }

    @Nullable
    public XmlDeclaration asXmlDeclaration() {
        List<String> lines = new ArrayList<>();
        lines.add("<!--xml declaration-->");
        for (String line : getLines()) {
            lines.add(line);
        }
        lines.add("</xml declaration>");
        if (!lines.isEmpty()) {
            return new XmlDeclaration(lines.get(0));
        } else {
            return null;
        }
    }

    public String getData() {
        return null;
    }
}

public class CommentTest {

    @Test
    public void should_add_comment_to_html_head() throws IOException {
        String data = "Hello World!";
        Comment comment = new Comment(data);
        appendToHtmlHead(comment, "example");
        assertCommentIsInHtmlHead(comment);
    }

}