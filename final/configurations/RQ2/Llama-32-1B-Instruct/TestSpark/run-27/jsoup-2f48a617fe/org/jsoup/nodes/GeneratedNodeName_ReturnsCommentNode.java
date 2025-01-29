package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNodeName_ReturnsCommentNode {

    public static String generateComment(String content) {
        return "<comment>" + content + "</comment>";
    }

    @Test
    public void nodeName_ReturnsCommentNode() {
        Comment comment = new Comment(generateComment("This is a test comment"));
        Assert.assertEquals("Comment", comment.nodeName());
    }

}