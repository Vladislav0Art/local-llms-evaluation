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
public class GeneratedWhenSetComment_thenCommentsAreSet {

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

}