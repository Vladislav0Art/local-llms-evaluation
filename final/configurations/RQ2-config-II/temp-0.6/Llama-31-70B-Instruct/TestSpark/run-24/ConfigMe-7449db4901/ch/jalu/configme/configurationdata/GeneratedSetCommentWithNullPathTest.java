package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedSetCommentWithNullPathTest {

    @Test
    public void setCommentWithNullPathTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        String[] commentLines = {"comment1", "comment2"};
        config.setComment(null, commentLines);
        Map<String, List<String>> comments = config.getAllComments();
        assertTrue(comments.isEmpty());
    }

}