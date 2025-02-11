package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

public class GeneratedNewCommentsConfiguration_setEmptyLine {

    @Test
    public void newCommentsConfiguration_setEmptyLine() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        String path = "path";
        String commentLines[] = {""};
        commentsConfig.setComment(path, commentLines);
        assertEquals(0, commentsConfig.getAllComments().get(path).size());
        assertTrue(commentsConfig.getAllComments().get(path).isEmpty());
    }

}