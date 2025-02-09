package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedIsXmlDeclaration_ReturnsTrue {

    @Test
    public void isXmlDeclaration_ReturnsTrue() {
        Comment comment = new Comment("");
        assertTrue(comment.isXmlDeclaration());
    }

}