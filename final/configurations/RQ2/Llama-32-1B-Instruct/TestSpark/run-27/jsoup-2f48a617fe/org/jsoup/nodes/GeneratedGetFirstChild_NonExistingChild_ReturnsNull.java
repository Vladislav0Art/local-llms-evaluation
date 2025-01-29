package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetFirstChild_NonExistingChild_ReturnsNull {

    public static String generateComment(String content) {
        return "<comment>" + content + "</comment>";
    }

    @Test
    public void getFirstChild_NonExistingChild_ReturnsNull() {
        Comment parent = new Comment(generateComment("Parent comment"));
        Comment child = parent.getFirstChild();
        Assert.assertNull(child);
    }

}