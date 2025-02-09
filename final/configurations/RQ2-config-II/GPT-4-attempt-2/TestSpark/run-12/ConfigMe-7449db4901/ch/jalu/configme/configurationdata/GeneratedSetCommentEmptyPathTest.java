package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCommentEmptyPathTest {

    @Test
    public void setCommentEmptyPathTest() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("", "line1", "line2");
        assertEquals(Arrays.asList("line1", "line2"), configuration.getAllComments().get(""));
    }

}