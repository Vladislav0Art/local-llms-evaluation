package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

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

    public void outerHtmlHead(Appendable accum, int depth, Document.OutputSettings out) throws IOException {
        if (depth == 0 && isXmlDeclaration()) {
            accum.append(data);
        }
    }

    public void outerHtmlTail(Appendable accum, int depth, Document.OutputSettings out) throws IOException {
        // Empty method
    }

    public boolean isXmlDeclaration() {
        return data.startsWith("<xml>");
    }

    @Override
    public String toString() {
        return "<!-- " + data + " -->";
    }

    public XmlDeclaration asXmlDeclaration() {
        if (isXmlDeclaration()) {
            return new XmlDeclaration(data);
        } else {
            return null;
        }
    }

    public static class XmlDeclaration {

        private String content;

        public XmlDeclaration(String content) {
            this.content = content;
        }

        @Override
        public int length() {
            return content.length();
        }
    }

}

public class Document {

    public static class OutputSettings {
        public int depth;
    }

}

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CommentTest {

    @Mock
    private Appendable accum;

}