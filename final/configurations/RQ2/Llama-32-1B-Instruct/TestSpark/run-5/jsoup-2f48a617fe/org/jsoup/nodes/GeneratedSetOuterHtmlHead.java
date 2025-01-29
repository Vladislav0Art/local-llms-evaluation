package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedSetOuterHtmlHead {

    @Override
    public String nodeName() {
        return "Comment";
    }

    @Override
    public String getData() {
        return data;
    }

    @Override
    public Comment setData(String data) {
        this.data = data;
        return this;
    }

    public void setOuterHtmlHead(Appendable accum, int depth, Document.OutputSettings out) throws IOException {
        // TODO: implement outer_html_head method
    }

    public void setOuterHtmlTail(Appendable accum, int depth, Document.OutputSettings out) {
        // TODO: implement outer_html_tail method
    }

    @Override
    public String toString() {
        return "Comment{" +
                "nodeName='" + nodeName() + '\'' +
                ", data='" + data + '\'' +
                '}';
    }

    @Override
    public Comment clone() {
        return new Comment(this.data);
    }

    public boolean isXmlDeclaration() {
        return false;
    }

    public XmlDeclaration asXmlDeclaration() {
        return null;
    }
}

public class TestComment extends LeafNodeTest {

    private String data;

    public TestComment(String data) {
        this.data = data;
    }

    @Test
    public void setOuterHtmlHead() {
        // TODO: implement test setOuterHtmlHead
    }

}