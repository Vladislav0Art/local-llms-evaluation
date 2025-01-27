package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNewCommentsConfigurationHasValidData {

    @Mock
    private SettingsHolder settingsHolder;

    public CommentsConfiguration getCommentsConfiguration() {
        return new CommentsConfiguration(settingsHolder);
    }

    @Test
    public void newCommentsConfigurationHasValidData() {
        Map<String, List<String>> validMap = Collections.singletonMap("path", Arrays.asList("comment1"));
        when(settingsHolder.getComments()).thenReturn(validMap);
        CommentsConfiguration commentsConfiguration = getCommentsConfiguration();
        assertEquals(validMap, commentsConfiguration.getAllComments());
    }

}