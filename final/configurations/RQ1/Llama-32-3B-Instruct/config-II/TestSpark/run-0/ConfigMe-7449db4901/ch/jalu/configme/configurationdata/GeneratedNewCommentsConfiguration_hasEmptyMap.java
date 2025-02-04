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
public class GeneratedNewCommentsConfiguration_hasEmptyMap {

    @Mock
    private SettingsHolder settingsHolder;

    @Test
    public void newCommentsConfiguration_hasEmptyMap() {
        // given
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

        // when
        Map<String, List<String>> comments = commentsConfiguration.comments;

        // then
        assertNotNull(comments);
        assertEquals(0, comments.size());
    }

}