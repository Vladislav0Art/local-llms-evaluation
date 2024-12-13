package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "testPath";
        String[] commentLines = new String[]{"testComment"};
        commentsConfiguration.setComment(path, commentLines);
        assertNotNull(commentsConfiguration.getAllComments());
    }

}