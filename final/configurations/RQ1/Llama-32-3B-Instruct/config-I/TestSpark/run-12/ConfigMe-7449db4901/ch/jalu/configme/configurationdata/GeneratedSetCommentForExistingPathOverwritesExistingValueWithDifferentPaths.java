package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Map;
import java.util.List;

public class GeneratedSetCommentForExistingPathOverwritesExistingValueWithDifferentPaths {

    @Test
    public void setCommentForExistingPathOverwritesExistingValueWithDifferentPaths() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path1", "line1\nline2");
        commentsConfiguration.setComment("path2", "line3\nline4");
        assertEquals(Arrays.asList("newLine1", "newLine2"), commentsConfiguration.getAllComments().get("path1"));
        assertEquals(Arrays.asList("line3", "line4"), commentsConfiguration.getAllComments().get("path2"));
    }

}