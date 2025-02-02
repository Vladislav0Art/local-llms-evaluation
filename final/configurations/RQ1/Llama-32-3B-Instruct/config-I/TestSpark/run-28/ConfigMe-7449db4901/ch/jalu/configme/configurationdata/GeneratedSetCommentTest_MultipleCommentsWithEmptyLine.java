package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

public class GeneratedSetCommentTest_MultipleCommentsWithEmptyLine {

    @Test
    public void setCommentTest_MultipleCommentsWithEmptyLine() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "path1";
        config.setComment(path, "", "line2");
        config.setComment(path, "line1", "");
        assertEquals(Arrays.asList("line2", "line1"), config.comments.get(path));
    }

}