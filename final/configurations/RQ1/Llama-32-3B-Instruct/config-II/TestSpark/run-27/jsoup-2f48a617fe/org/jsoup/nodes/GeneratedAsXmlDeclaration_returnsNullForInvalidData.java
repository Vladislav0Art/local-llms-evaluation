package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.io.IOException;

public class GeneratedAsXmlDeclaration_returnsNullForInvalidData {

    @Test
    public void asXmlDeclaration_returnsNullForInvalidData() throws IOException, CloneNotSupportedException {
        String data = "<data>";
        Comment comment = new Comment(data);
        assert comment.asXmlDeclaration() == null;
    }

}