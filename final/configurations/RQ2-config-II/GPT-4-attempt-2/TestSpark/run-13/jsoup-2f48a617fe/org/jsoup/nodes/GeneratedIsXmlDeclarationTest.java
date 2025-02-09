package org.jsoup.nodes;

import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsXmlDeclarationTest {

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("test");
        Assert.assertFalse(comment.isXmlDeclaration());
    }

}