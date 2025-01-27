package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedAsXmlDeclarationReturnsNull {

    @Test
    public void asXmlDeclarationReturnsNull() {
        Comment comment = new Comment("test");
        assertNull(comment.asXmlDeclaration());
    }
}

class Appendable {
    private StringBuilder content;

    public void append(String data) {
        content.append(data);
    }

    public String getContent() {
        return content.toString();
    }

}