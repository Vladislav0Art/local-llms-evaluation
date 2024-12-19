package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedAsXmlDeclaration_ReturnsNullWhenNotStartingWithExclamationMark {

    @Test
    public void asXmlDeclaration_ReturnsNullWhenNotStartingWithExclamationMark() {
        // [MethodUnderTest][Scenario]Test
        Comment comment = new Comment("This is a comment");
        assertThat(comment.asXmlDeclaration(), is(null));
    }

}