package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedIsXmlDeclarationReturnsFalseWhenDataIsTooShort {

    @Test
    public void isXmlDeclarationReturnsFalseWhenDataIsTooShort() {
        // [MethodUnderTest][Scenario]Test
        Comment comment = new Comment("");
        assertThat(comment.isXmlDeclaration(), is(false));
    }

}