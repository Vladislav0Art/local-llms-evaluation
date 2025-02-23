package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCommentTest {

    @Mock
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setCommentTest() {
        String path = "path";
        String[] commentLines = new String[]{"comment1", "comment2"};

        commentsConfiguration.setComment(path, commentLines);

        assertNotNull(commentsConfiguration.getAllComments().get(path));
        assertEquals(2, commentsConfiguration.getAllComments().get(path).size());
        assertEquals("comment1", commentsConfiguration.getAllComments().get(path).get(0));
        assertEquals("comment2", commentsConfiguration.getAllComments().get(path).get(1));
    }

}