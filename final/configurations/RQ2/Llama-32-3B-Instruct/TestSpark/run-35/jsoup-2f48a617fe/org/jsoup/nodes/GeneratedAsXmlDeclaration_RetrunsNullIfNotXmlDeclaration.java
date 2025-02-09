package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedAsXmlDeclaration_RetrunsNullIfNotXmlDeclaration {

    @Test
    public void asXmlDeclaration_RetrunsNullIfNotXmlDeclaration() {
        Comment comment = new Comment("");
        assertNull(comment.asXmlDeclaration());
    }

}