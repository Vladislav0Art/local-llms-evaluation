package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedToStringIncludesData {

    @Test
    public void toStringIncludesData() {
        Comment comment = new Comment("data");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Appendable accum = out;
        comment.outerHtmlHead(accum, 0, null);
        assertTrue(out.toString().contains("data"));
    }
}

public class MockParser implements Parser {
    @Override
    public String parse(String data) throws IOException {
        return data;
    }

    @Override
    public void outerHtmlTail(Appendable accum, int depth, Document.OutputSettings out) throws IOException {
    }

    @Override
    public void outerHtmlHead(Appendable accum, int depth, Document.OutputSettings out) throws IOException {
    }
}

public class MockDocument extends LeafNode {
    private Comment comment;

    public Comment getComment() {
        return comment;
    }

}