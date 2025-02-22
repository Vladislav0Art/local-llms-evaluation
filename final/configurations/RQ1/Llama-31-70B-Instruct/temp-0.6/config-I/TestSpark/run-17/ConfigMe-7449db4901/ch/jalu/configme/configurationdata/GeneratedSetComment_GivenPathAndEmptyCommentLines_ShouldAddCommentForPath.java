package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import static org.mockito.Mockito.*;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.SettingsHolder;

import java.util.Map;
import java.util.List;

public class GeneratedSetComment_GivenPathAndEmptyCommentLines_ShouldAddCommentForPath {

    @Test
    public void setComment_GivenPathAndEmptyCommentLines_ShouldAddCommentForPath() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "test";
        String comment = "";
        commentsConfiguration.setComment(path, comment);

        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertTrue(allComments.containsKey(path));
        List<String> commentsForPath = allComments.get(path);
        assertEquals(1, commentsForPath.size());
        assertEquals(comment, commentsForPath.get(0));
    }

}