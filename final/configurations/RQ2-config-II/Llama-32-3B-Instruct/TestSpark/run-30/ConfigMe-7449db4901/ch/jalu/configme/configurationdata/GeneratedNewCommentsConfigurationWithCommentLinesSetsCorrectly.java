package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedNewCommentsConfigurationWithCommentLinesSetsCorrectly {

    @Test
    public void newCommentsConfigurationWithCommentLinesSetsCorrectly() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(new HashMap<>());
        List<String> commentLines = Arrays.asList("line1", "line2");
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertEquals(commentLines, allComments.get("comment"));
    }

}