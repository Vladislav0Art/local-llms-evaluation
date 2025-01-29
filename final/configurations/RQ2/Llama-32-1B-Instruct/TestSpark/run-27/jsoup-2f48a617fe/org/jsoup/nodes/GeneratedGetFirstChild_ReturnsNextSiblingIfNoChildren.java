package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetFirstChild_ReturnsNextSiblingIfNoChildren {

    public static String generateComment(String content) {
        return "<comment>" + content + "</comment>";
    }

    @Test
    public void getFirstChild_ReturnsNextSiblingIfNoChildren() {
        Comment root = new Comment(generateComment("This is a test comment"));
        Comment child = (Comment) root.getFirst();

        Assert.assertEquals(child, child2); // Assuming there's only one sibling element
    }

}