package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetFirstChildOfDescendant_NonExistingDescendant_ReturnsNull {

    public static String generateComment(String content) {
        return "<comment>" + content + "</comment>";
    }

    @Test
    public void getFirstChildOfDescendant_NonExistingDescendant_ReturnsNull() {
        Comment parent = new Comment(generateComment("Parent comment"));
        child = parent.getFirstChild();
        Assert.assertNull(child);
    }

}