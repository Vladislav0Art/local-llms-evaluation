package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private SettingsHolder settingsHolder;

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void whenSetComment_thenCommentsAreSet() {
        String path = "path";
        String[] commentLines = {"comment1", "comment2"};
        commentsConfiguration.setComment(path, commentLines);

        Map<String, List<String>> actualComments = commentsConfiguration.getAllComments();
        assertEquals(1, actualComments.size());
        assertEquals(Arrays.asList(commentLines), actualComments.get(path));
    }

    @Test
    public void whenGetAllComments_thenCommentsAreReturned() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("comment1", "comment2"));
        comments.put("path2", Arrays.asList("comment3", "comment4"));
        when(settingsHolder.getComments()).thenReturn(comments);

        Map<String, List<String>> actualComments = commentsConfiguration.getAllComments();

        assertEquals(comments, actualComments);
    }

}