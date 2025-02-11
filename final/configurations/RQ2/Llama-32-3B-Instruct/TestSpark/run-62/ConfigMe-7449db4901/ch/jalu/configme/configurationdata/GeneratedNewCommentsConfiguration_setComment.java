package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

public class GeneratedNewCommentsConfiguration_setComment {

    @Test
    public void newCommentsConfiguration_setComment() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        String path = "path";
        String[] commentLines = {"line1", "line2"};
        commentsConfig.setComment(path, commentLines);
        assertEquals(2, commentsConfig.getAllComments().get(path).size());
        assertTrue(commentsConfig.getAllComments().get(path).containsAll(Arrays.asList("line1", "line2")));
    }

}