package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNewCommentConfigurationCreationFromMap_ReturnsInstance {

    @Mock
    private SettingsHolder settingsHolder;

    @Test
    public void newCommentConfigurationCreationFromMap_ReturnsInstance() {
        Map<String, List<String>> comments = Collections.singletonMap("key", Arrays.asList("value"));
        CommentsConfiguration commentConfiguration = new CommentsConfiguration(comments);
        assertNotNull(commentConfiguration);
    }

}