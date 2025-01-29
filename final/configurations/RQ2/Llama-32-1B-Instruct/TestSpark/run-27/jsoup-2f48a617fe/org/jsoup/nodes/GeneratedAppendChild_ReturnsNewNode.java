package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAppendChild_ReturnsNewNode {

    public static String generateComment(String content) {
        return "<comment>" + content + "</comment>";
    }

    @Test
    public void appendChild_ReturnsNewNode() {
        Comment parent = new Comment(generateComment("Parent"));
        Comment child = new Comment(generateComment("Child"));

        parent.appendChild(child);
        Assert.assertEquals(child, child2);

        parent = new Comment(generateComment("Grandparent"));

        parent.appendChild(parent.getPreviousSibling());
    }

}