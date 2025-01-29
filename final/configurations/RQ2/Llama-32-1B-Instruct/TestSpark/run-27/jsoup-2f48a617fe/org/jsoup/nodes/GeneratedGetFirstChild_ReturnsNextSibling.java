package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetFirstChild_ReturnsNextSibling {

    public static String generateComment(String content) {
        return "<comment>" + content + "</comment>";
    }

    @Test
    public void getFirstChild_ReturnsNextSibling() {
        Comment root = new Comment(generateComment("First child"));
        root.appendChild(new Comment(generateComment("Second child")));
        Comment child1 = (Comment) root.getFirst();
        Comment child2 = (Comment) root.getNextSibling();

        Assert.assertEquals(child1, child2);
    }

}