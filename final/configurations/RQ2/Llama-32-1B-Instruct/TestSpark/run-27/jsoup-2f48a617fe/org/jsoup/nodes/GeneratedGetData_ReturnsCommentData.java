package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetData_ReturnsCommentData {

    public static String generateComment(String content) {
        return "<comment>" + content + "</comment>";
    }

    @Test
    public void getData_ReturnsCommentData() {
        Comment comment = new Comment(generateComment("This is a test comment"));
        String data = comment.getData();
        Assert.assertEquals(content, data);
    }

}