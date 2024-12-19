package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetComment_Path_CommentLinesSet {

    @Test
    public void setComment_Path_CommentLinesSet() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "path";
        String[] commentLines = {"line1", "line2"};
        config.setComment(path, commentLines);
        Map<String, List<String>> comments = config.getAllComments();
        assertEquals(1, comments.size());
        assertEquals(2, comments.get(path).size());
    }

}