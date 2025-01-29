package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAppendChildren_NestedComments_ReturnsFalse {

    public static String generateComment(String content) {
        return "<comment>" + content + "</comment>";
    }

    @Test
    public void appendChildren_NestedComments_ReturnsFalse() {
        Comment parent = new Comment(generateComment("Parent comment"));
        parent.addChild(new Comment(generateComment("Nested comment")));
        Assert.assertFalse(parent.hasChild(parent));
    }

}