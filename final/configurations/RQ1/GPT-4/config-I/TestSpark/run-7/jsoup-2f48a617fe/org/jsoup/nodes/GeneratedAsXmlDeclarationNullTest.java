package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedAsXmlDeclarationNullTest {

    @Test
    public void asXmlDeclarationNullTest() {
        Comment comment = new Comment("!Not a valid XML");
        Assert.assertNull(comment.asXmlDeclaration());
    }

}