package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentEmptyLineTest {

    @Test
    public void setCommentEmptyLineTest() {
        CommentsConfiguration configuration = new CommentsConfiguration();

        configuration.setComment("path1", "");

        Map<String, List<String>> expected = new HashMap<>();
        expected.put("path1", Collections.singletonList(""));

        assertEquals(expected, configuration.getAllComments());
    }

}