package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

public class GeneratedSetCommentTest_MultipleComments {

    @Test
    public void setCommentTest_MultipleComments() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "path1";
        config.setComment(path, "line1");
        config.setComment(path, "line2");
        assertEquals(Arrays.asList("line1", "line2"), config.comments.get(path));
    }

}