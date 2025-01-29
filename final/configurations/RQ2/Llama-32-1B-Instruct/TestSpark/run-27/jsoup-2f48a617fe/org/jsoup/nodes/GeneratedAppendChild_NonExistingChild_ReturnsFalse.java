package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAppendChild_NonExistingChild_ReturnsFalse {

    public static String generateComment(String content) {
        return "<comment>" + content + "</comment>";
    }

    @Test
    public void appendChild_NonExistingChild_ReturnsFalse() {
        Comment parent = new Comment(generateComment("Parent comment"));
        Comment child = new Comment(generateComment("Child comment"));
        parent.addChild(child);
        Assert.assertFalse(parent.hasChild(child));
    }

}