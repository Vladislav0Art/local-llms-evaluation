package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedInsertCommentTokenTest {

    @Test
    public void insertCommentTokenTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Comment commentToken = new Token.Comment();
        commentToken.setData("This is a comment");
        xmlTreeBuilder.insert(commentToken);
    }

}