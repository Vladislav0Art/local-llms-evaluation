package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

public class GeneratedSetCommentForEmptyStringPathDoesNotAddNewLines {

    @Test
    public void setCommentForEmptyStringPathDoesNotAddNewLines() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("", "\n");
        Map<String, List<String>> comments = config.getAllComments();
        assertEquals(0, comments.size());
    }

}