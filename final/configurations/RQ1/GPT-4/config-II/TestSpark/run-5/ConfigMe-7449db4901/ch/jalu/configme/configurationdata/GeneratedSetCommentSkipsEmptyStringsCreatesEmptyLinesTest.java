package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.List;

public class GeneratedSetCommentSkipsEmptyStringsCreatesEmptyLinesTest {

    @Test
    public void setCommentSkipsEmptyStringsCreatesEmptyLinesTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path", "comment1", "\n", "comment2");

        assertEquals(1, config.getAllComments().size());
        assertEquals(Arrays.asList("comment1", "\n", "comment2"), config.getAllComments().get("path"));
    }

}