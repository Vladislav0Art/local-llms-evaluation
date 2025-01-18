package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedSetCommentNewCommentTest {

    @Test
    public void setCommentNewCommentTest() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        commentsConfig.setComment("path1", "comment1", "comment2");

        Map<String, List<String>> savedComments = commentsConfig.getAllComments();
        assertNotNull(savedComments);
    }

}