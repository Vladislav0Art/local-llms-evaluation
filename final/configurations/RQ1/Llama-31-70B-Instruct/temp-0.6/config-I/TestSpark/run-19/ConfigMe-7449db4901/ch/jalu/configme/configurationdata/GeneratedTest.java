package ch.jalu.configme.configurationdata;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    private CommentsConfiguration commentsConfiguration;

    @Before
    public void setup() {
        commentsConfiguration = new CommentsConfiguration();
    }

    @Test
    public void setComment_validPathAndCommentLines_setsComment() {
        String path = "test-path";
        String[] commentLines = new String[]{"comment1", "comment2"};
        commentsConfiguration.setComment(path, commentLines);
        List<String> comments = commentsConfiguration.comments.get(path);
        assertEquals(Arrays.asList(commentLines), comments);
    }

}