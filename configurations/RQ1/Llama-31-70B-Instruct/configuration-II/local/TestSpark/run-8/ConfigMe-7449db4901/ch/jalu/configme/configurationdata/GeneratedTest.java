package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Map<String, List<String>> comments;

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        String path = "testPath";
        String[] commentLines = new String[]{"testComment"};
        commentsConfiguration.setComment(path, commentLines);
        assertNotNull(commentsConfiguration.getAllComments());
    }

    @Test
    public void getAllCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("testPath", Collections.singletonList("testComment"));
        when(comments.get("testPath")).thenReturn(Collections.singletonList("testComment"));
        assertEquals(commentsMap, commentsConfiguration.getAllComments());
    }

}