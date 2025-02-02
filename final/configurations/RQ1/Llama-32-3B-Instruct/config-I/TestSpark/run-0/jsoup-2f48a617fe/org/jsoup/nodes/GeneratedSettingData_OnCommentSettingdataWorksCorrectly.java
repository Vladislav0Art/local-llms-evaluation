package org.jsoup.nodes;

public class GeneratedSettingData_OnCommentSettingdataWorksCorrectly {

    @Test
    public void SettingData_OnCommentSettingdataWorksCorrectly() {
        Comment comment = new Comment("");
        comment.setData("This is a test comment");
        assertEquals("This is a test comment", comment.getData());
    }

}