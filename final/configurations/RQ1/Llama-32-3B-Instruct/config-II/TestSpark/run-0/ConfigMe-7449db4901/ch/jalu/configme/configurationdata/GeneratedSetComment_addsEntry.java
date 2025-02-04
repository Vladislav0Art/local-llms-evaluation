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
public class GeneratedSetComment_addsEntry {

    @Mock
    private SettingsHolder settingsHolder;

    @Test
    public void setComment_addsEntry() {
        // given
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "path";
        String commentLine = "line";

        // when
        commentsConfiguration.setComment(path, commentLine);

        // then
        assertNotNull(commentsConfiguration.comments);
        assertTrue(commentsConfiguration.comments.containsKey(path));
        assertEquals(1, commentsConfiguration.comments.get(path).size());
    }

}