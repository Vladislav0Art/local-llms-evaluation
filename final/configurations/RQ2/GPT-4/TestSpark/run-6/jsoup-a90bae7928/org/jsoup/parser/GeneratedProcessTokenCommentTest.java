package org.jsoup.parser;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedProcessTokenCommentTest {

    @Test
    public void processTokenCommentTest() {
        Token.Comment comment = new Token.Comment();
        comment.getDataBuffer().append("comment");
        processTokenTest(comment);
    }

}