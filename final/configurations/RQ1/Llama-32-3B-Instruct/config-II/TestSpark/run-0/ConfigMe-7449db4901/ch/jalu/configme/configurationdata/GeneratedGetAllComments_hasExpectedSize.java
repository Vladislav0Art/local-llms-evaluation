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
public class GeneratedGetAllComments_hasExpectedSize {

    @Mock
    private SettingsHolder settingsHolder;

    @Test
    public void getAllComments_hasExpectedSize() {
        // given
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> map = Mockito.mock(Map.class);
        when(commentsConfiguration.comments).thenReturn(map);

        Map<String, @UnmodifiableView List<String>> actualMap = commentsConfiguration.getAllComments();

        assertEquals(0, actualMap.size());
    }

}