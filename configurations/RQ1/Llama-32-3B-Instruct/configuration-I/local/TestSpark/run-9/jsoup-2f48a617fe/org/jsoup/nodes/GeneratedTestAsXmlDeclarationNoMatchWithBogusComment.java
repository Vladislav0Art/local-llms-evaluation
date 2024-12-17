package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedTestAsXmlDeclarationNoMatchWithBogusComment {

    @Test
    public void testAsXmlDeclarationNoMatchWithBogusComment() {
        Comment comment = new Comment("Hello World!");
        assertNull(comment.asXmlDeclaration());
    }

}