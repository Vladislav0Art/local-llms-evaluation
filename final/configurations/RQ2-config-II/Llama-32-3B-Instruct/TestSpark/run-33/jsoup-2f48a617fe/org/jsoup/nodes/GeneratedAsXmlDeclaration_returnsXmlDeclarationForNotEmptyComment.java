package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.any;

public class GeneratedAsXmlDeclaration_returnsXmlDeclarationForNotEmptyComment {

    @Test
    public void asXmlDeclaration_returnsXmlDeclarationForNotEmptyComment() throws IOException {
        Comment comment = new Comment("data");
        XmlDeclaration declaration = Mockito.mock(XmlDeclaration.class);
        Mockito.when(comment.asXmlDeclaration()).thenReturn(declaration);
        assertEquals(declaration, comment.asXmlDeclaration());
    }

}