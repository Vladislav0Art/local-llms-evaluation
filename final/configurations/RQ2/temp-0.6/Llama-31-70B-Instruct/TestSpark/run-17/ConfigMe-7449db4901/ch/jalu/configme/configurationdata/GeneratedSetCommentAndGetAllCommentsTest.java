package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetCommentAndGetAllCommentsTest {

    @Test
    public void setCommentAndGetAllCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path1", "comment1", "comment2");
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertEquals(1, allComments.size());
        assertEquals(Arrays.asList("comment1", "comment2"), allComments.get("path1"));
    }
}

}