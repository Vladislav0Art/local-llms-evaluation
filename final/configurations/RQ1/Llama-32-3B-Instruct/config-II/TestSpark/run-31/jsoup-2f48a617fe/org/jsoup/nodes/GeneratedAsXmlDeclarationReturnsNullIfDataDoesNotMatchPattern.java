package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.ByteArrayInputStream;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.nodes.NodeUtils;
import org.jsoup.nodes.Appendable;

public class GeneratedAsXmlDeclarationReturnsNullIfDataDoesNotMatchPattern {

    @Test
    public void asXmlDeclarationReturnsNullIfDataDoesNotMatchPattern() throws IOException {
        Comment comment = new Comment("test");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNull(decl);
    }
}

public class MockedComment extends Comment {
    private final String data;

    public MockedComment(String data) {
        super(data);
        this.data = data;
    }

    @Override
    public String getData() {
        return data;
    }

}