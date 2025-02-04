package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedAsXmlDeclaration_ReturnsNullWhenDataNotAnXmlDeclaration {

    @Test
    public void AsXmlDeclaration_ReturnsNullWhenDataNotAnXmlDeclaration() {
        Comment comment = new Comment("!Hello, World!");
        assertNull(comment.asXmlDeclaration());
    }

}