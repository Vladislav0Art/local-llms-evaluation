package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedRemoveChild_ReturnsNull {

    public static String generateComment(String content) {
        return "<comment>" + content + "</comment>";
    }

    @Test
    public void removeChild_ReturnsNull() {
        Comment root = new Comment(generateComment("This is a test comment"));
        Comment grandchild = (Comment) root.getFirst();

        root.removeChild(grandchild);

        Assert.assertNull(root);
    }

}