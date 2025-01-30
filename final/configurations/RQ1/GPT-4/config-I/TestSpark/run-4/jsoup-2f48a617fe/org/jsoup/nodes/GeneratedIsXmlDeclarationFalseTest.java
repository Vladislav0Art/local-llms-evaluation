package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedIsXmlDeclarationFalseTest {

    @Test
    public void isXmlDeclarationFalseTest() {
        Comment comment = new Comment("Test Data");
        Assert.assertFalse(comment.isXmlDeclaration());
    }

}