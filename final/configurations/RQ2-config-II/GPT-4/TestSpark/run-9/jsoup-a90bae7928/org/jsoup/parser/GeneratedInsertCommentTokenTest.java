package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInsertCommentTokenTest {

    @Test
    public void insertCommentTokenTest() {
        XmlTreeBuilder parser = new XmlTreeBuilder();
        Token.Comment commentToken = new Token.Comment();
        commentToken.data("test comment");
        parser.insert(commentToken);
    }

}