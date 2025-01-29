package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedTest setOuterHtmlHead {

    private String data;

    public Comment(String data) {
        this.data = data;
    }

    @Override
    public String nodeName() {
        return "Comment";
    }

    @Nullable
    @Override
    public String getData() {
        return data;
    }

    @Override
    public Node setData(String data) {
        this.data = data;
        return this;
    }

    @Override
    public void setOuterHtmlHead(Appendable accum, int depth, Document.OutputSettings out) throws IOException {
        // TODO: implement outer_html_head method
    }

    @Nullable
    @Override
    public String getOuterHtml() {
        return null;
    }

    @Override
    public ParseSettings parseSettings() {
        return new ParseSettings();
    }
}

public class TestComment extends NodeTest {

    private String data;

    public TestComment(String data) {
        this.data = data;
    }

    @Test
    public void test

    setOuterHtmlHead() {
        // TODO: implement test setOuterHtmlHead
    }

}