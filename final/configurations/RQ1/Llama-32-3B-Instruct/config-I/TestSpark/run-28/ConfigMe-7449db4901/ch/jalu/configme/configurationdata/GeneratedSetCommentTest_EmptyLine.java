package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

public class GeneratedSetCommentTest_EmptyLine {

    @Test
    public void setCommentTest_EmptyLine() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "path1";
        config.setComment(path, "", "");
        assertEquals(Collections.singletonList(""), config.comments.get(path));
    }

}