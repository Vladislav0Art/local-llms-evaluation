package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedNewCommentsConfigurationWithCommentLinesSetsCorrectEntry {

    @Test
    public void newCommentsConfigurationWithCommentLinesSetsCorrectEntry() {
        Map<String, List<String>> comments = new HashMap<>();
        String line1 = "line1";
        String line2 = "line2";
        CommentsConfiguration commentConfig = new CommentsConfiguration(comments);
        commentConfig.setComment("path", line1, line2);
        assertEquals(2, commentConfig.getAllComments().get("path").size());
    }

}