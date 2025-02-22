package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import static org.mockito.Mockito.*;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.SettingsHolder;

import java.util.Map;
import java.util.List;

public class GeneratedSetComment_GivenPathAndCommentLines_ShouldAddCommentForPath {

    @Test
    public void setComment_GivenPathAndCommentLines_ShouldAddCommentForPath() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "test";
        String comment1 = "test comment 1";
        String comment2 = "test comment 2";
        commentsConfiguration.setComment(path, comment1, comment2);

        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertTrue(allComments.containsKey(path));
        List<String> commentsForPath = allComments.get(path);
        assertEquals(2, commentsForPath.size());
        assertEquals(comment1, commentsForPath.get(0));
        assertEquals(comment2, commentsForPath.get(1));
    }

}