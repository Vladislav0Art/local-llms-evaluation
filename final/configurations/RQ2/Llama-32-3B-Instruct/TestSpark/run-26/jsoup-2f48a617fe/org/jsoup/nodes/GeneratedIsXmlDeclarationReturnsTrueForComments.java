package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.io.ByteArrayOutputStream;

public class GeneratedIsXmlDeclarationReturnsTrueForComments {

    @Test
    public void isXmlDeclarationReturnsTrueForComments() {
        Comment comment = new Comment("data");
        assertTrue(comment.isXmlDeclaration());
    }

}