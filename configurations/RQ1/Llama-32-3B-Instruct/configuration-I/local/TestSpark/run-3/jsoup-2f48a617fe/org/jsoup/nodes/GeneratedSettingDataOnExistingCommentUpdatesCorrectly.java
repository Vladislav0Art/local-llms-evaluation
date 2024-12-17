package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;

public class GeneratedSettingDataOnExistingCommentUpdatesCorrectly {

    @Test
    public void settingDataOnExistingCommentUpdatesCorrectly() {
        Comment comment = new Comment("Hello");
        comment.setData("World");
        assertEquals("World", comment.getData());
    }

}