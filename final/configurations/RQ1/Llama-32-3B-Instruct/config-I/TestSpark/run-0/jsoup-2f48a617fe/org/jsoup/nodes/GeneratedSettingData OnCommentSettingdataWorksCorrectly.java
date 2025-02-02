package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Comment;

public class GeneratedSettingData OnCommentSettingdataWorksCorrectly {

    @Test
    public void SettingData

    OnCommentSettingdataWorksCorrectly() {
        Comment comment = new Comment("");
        comment.setData("This is a test comment");
        assertEquals("This is a test comment", comment.getData());
    }

}