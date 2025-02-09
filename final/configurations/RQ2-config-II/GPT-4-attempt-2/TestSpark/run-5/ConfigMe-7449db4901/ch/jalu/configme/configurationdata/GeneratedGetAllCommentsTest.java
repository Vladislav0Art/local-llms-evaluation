package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Collections;
import java.util.Map;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GeneratedGetAllCommentsTest {

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("testPath", Arrays.asList("line1", "line2"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);

        assertEquals(comments, commentsConfiguration.getAllComments());
    }

}