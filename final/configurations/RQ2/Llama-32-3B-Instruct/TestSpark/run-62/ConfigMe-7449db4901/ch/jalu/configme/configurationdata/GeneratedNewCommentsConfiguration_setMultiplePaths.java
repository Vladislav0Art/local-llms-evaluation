package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

public class GeneratedNewCommentsConfiguration_setMultiplePaths {

    @Test
    public void newCommentsConfiguration_setMultiplePaths() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        String path1 = "path1";
        String[] commentLines1 = {"line1", "line2"};
        String path2 = "path2";
        String[] commentLines2 = {"line3"};
        commentsConfig.setComment(path1, commentLines1);
        commentsConfig.setComment(path2, commentLines2);
        assertEquals(2, commentsConfig.getAllComments().size());
        assertTrue(commentsConfig.getAllComments().containsKey(path1));
        assertTrue(commentsConfig.getAllComments().containsKey(path2));
    }

}