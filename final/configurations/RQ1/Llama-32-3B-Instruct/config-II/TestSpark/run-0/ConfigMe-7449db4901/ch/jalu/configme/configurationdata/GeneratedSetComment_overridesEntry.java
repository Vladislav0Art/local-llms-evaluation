package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetComment_overridesEntry {

    @Mock
    private SettingsHolder settingsHolder;

    @Test
    public void setComment_overridesEntry() {
        // given
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "path";
        List<String> commentLines = Arrays.asList("line");

        commentsConfiguration.setComment(path, commentLine);

        when(settingsHolder.registerComments()).thenReturn(commentLines);

        // when
        commentsConfiguration.setComment(path, "newLine");

        // then
        assertNotNull(commentsConfiguration.comments);
        assertTrue(commentsConfiguration.comments.containsKey(path));
        assertEquals(1, commentsConfiguration.comments.get(path).size());
    }

}