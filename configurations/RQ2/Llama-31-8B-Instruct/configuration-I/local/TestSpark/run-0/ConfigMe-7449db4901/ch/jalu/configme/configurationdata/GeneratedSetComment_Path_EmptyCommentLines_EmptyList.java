package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetComment_Path_EmptyCommentLines_EmptyList {

    @Test
    public void setComment_Path_EmptyCommentLines_EmptyList() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "path";
        commentsConfiguration.setComment(path, "");
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertEquals(1, allComments.size());
        assertTrue(allComments.get(path).isEmpty());
    }

}