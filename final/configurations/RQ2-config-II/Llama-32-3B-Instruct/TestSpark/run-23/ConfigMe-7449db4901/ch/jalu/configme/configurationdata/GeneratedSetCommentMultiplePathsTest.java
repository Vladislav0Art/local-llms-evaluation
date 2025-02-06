package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetCommentMultiplePathsTest {

    @Test
    public void setCommentMultiplePathsTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        String[] path1 = {"path1"};
        String[] path2 = {"path2"};
        String[] commentLine1 = {"line1", "line2"};
        String[] commentLine2 = {"line3", "line4"};
        config.setComment(path1[0], commentLine1[0], commentLine1[1]);
        config.setComment(path2[0], commentLine2[0], commentLine2[1]);
        assertEquals(Arrays.asList(new String[][]{{commentLine1}, {commentLine2}}), config.getAllComments());
    }

}