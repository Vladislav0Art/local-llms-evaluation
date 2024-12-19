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
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "path";
        config.setComment(path, "");
        Map<String, List<String>> comments = config.getAllComments();
        assertEquals(1, comments.size());
        assertTrue(comments.get(path).isEmpty());
    }

}