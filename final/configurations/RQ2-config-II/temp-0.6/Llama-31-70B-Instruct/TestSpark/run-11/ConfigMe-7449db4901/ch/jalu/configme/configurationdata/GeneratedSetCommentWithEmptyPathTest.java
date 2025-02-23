package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedSetCommentWithEmptyPathTest {

    @Test
    public void setCommentWithEmptyPathTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String[] commentLines = {"comment1", "comment2"};
        commentsConfiguration.setComment("", commentLines);
        List<String> actual = commentsConfiguration.getAllComments().get("");
        assertEquals(Arrays.asList(commentLines), actual);
    }

}