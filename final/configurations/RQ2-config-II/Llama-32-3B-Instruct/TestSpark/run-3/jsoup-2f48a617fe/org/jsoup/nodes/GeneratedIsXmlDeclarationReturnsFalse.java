package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedIsXmlDeclarationReturnsFalse {

    @Test
    public void isXmlDeclarationReturnsFalse() {
        Comment comment = new Comment("data");
        assertFalse(comment.isXmlDeclaration());
    }

}