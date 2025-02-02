package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() {
        Document document = new Document();
        Appendable accum = Mockito.mock(Appendable.class);
        document.outerHtmlTail(accum, 0, "");
        assertEquals("", accum.toString());
    }
}

public class Document {
    private String html;

    public Document() {
    }

    public String outerHtmlHead(Appendable accum, int indent, String content) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < indent; i++) {
            sb.append(" ");
        }
        sb.append("<html>");
        if (!content.isEmpty()) {
            sb.append(content);
        }
        sb.append("</html>");
        accum.append(sb.toString());
        return html;
    }

    public String outerHtmlTail(Appendable accum, int indent, String content) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < indent; i++) {
            sb.append(" ");
        }
        if (!content.isEmpty()) {
            sb.append("<body>");
            sb.append(content);
            sb.append("</body>");
        }
        sb.append("</html>");
        accum.append(sb.toString());
        return html;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }
}

public class Appendable implements Appendable {
    private StringBuilder content;

    public Appendable() {
    }

    @Override
    public void append(CharSequence csq) throws appendFailedException {
        if (content == null) {
            content = new StringBuilder();
        }
        content.append(csq);
    }

    @Override
    public String toString() {
        return content.toString();
    }
}

public class DocumentTests {
    private Document document;

    public DocumentTests() {
    }

    public void testOuterHtmlHead() {
        document = new Document();
        Appendable accum = Mockito.mock(Appendable.class);
        document.outerHtmlHead(accum, 0, "");
        assertEquals("", accum.toString());
    }

    public void testOuterHtmlTail() {
        document = new Document();
        Appendable accum = Mockito.mock(Appendable.class);
        document.outerHtmlTail(accum, 0, "");
        assertEquals("", accum.toString());
    }
}

public class AppenderAdapter implements Appendable {
    private StringBuilder content;

    public AppenderAdapter(StringBuilder content) {
        this.content = content;
    }

    @Override
    public void append(CharSequence csq) throws appendFailedException {
        if (content == null) {
            content = new StringBuilder();
        }
        content.append(csq);
    }

    @Override
    public String toString() {
        return content.toString();
    }

}