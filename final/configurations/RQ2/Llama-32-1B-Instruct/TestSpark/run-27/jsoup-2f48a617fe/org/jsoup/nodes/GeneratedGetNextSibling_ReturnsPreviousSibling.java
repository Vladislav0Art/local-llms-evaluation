package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetNextSibling_ReturnsPreviousSibling {

    public static String generateComment(String content) {
        return "<comment>" + content + "</comment>";
    }

    @Test
    public void getNextSibling_ReturnsPreviousSibling() {
        Comment root = new Comment(generateComment("First child"));
        root.appendChild(new Comment(generateComment("Second child")));
        Comment child1 = (Comment) root.getNextSibling();
        Comment child2 = (Comment) root.getPrevSibling();

        Assert.assertEquals(child2, child1);
    }

}