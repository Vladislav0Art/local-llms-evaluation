package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Map;
import java.util.List;

public class GeneratedSetCommentForExistingPathOverwritesExistingValue {

    @Test
    public void setCommentForExistingPathOverwritesExistingValue() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path1", "line1\nline2");
        commentsConfiguration.setComment("path1", "newLine1", "newLine2");
        assertEquals(Arrays.asList("newLine1", "newLine2"), commentsConfiguration.getAllComments().get("path1"));
    }

}