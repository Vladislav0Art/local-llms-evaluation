package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedSetComment_NewSingleLineCommentTextTest {

    @Test
    public void setComment_NewSingleLineCommentTextTest() {
        String path = "testPath";
        String comment = "The single comment line";
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment(path, comment);

        Map<String, List<String>> comments = commentsConfiguration.getAllComments();

        assertTrue(comments.containsKey(path));
        assertEquals(Collections.singletonList(comment), comments.get(path));
    }

}