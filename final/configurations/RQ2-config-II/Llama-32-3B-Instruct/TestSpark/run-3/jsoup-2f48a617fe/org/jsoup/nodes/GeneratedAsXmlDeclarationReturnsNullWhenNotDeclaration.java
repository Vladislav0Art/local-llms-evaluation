package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedAsXmlDeclarationReturnsNullWhenNotDeclaration {

    @Test
    public void asXmlDeclarationReturnsNullWhenNotDeclaration() {
        Comment comment = new Comment("data");
        assertNull(comment.asXmlDeclaration());
    }

}