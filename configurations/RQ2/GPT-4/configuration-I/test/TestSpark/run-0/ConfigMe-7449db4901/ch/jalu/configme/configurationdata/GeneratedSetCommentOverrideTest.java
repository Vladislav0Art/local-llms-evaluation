package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

public class GeneratedSetCommentOverrideTest {

    @Test
    public void setCommentOverrideTest() {
        String path = "path1";
        String[] commentLines1 = {"Line 1", "Line 2"};
        String[] commentLines2 = {"Line 3", "Line 4"};
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment(path, commentLines1);
        commentsConfiguration.setComment(path, commentLines2);
        assertEquals(Arrays.asList(commentLines2), commentsConfiguration.getAllComments().get(path));
    }

}