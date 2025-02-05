package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedGetAllCommentsTest {

    @Test
    public void getAllCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertTrue(commentsConfiguration.getAllComments().isEmpty());

        String path = "path";
        String[] commentLines = new String[]{"comment1", "comment2"};
        commentsConfiguration.setComment(path, commentLines);

        List<String> commentList = Arrays.asList(commentLines);
        assertEquals(commentList, commentsConfiguration.getAllComments().get(path));
    }

}