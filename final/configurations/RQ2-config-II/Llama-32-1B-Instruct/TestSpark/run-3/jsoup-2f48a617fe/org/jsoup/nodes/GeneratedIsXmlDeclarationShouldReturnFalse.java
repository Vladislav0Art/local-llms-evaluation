package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedIsXmlDeclarationShouldReturnFalse {

    @Test
    public void isXmlDeclarationShouldReturnFalse() {
        Comment comment = new Comment("");
        assertTrue(!comment.isXmlDeclaration());
    }

}