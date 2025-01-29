package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetPreviousSibling_ReturnsNextSiblingIfNoChildren {

    public static String generateComment(String content) {
        return "<comment>" + content + "</comment>";
    }

    @Test
    public void getPreviousSibling_ReturnsNextSiblingIfNoChildren() {
        Comment root = new Comment(generateComment("This is a test comment"));
        Comment child = (Comment) root.getPrevSibling();

        Assert.assertEquals(root, child); // Assuming there's only one sibling element
    }

}