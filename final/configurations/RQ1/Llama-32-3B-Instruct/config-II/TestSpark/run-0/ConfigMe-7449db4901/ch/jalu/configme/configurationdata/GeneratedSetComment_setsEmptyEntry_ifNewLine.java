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
public class GeneratedSetComment_setsEmptyEntry_ifNewLine {

    @Mock
    private SettingsHolder settingsHolder;

    @Test
    public void setComment_setsEmptyEntry_ifNewLine() {
        // given
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "path";
        List<String> commentLines = Collections.emptyList();

        when(settingsHolder.registerComments()).thenReturn(commentLines);

        // when
        commentsConfiguration.setComment(path, "\n");

        // then
        assertNotNull(commentsConfiguration.comments);
        assertTrue(commentsConfiguration.comments.containsKey(path));
        assertEquals(0, commentsConfiguration.comments.get(path).size());
    }

}