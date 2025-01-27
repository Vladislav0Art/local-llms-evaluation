package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNewCommentsConfigurationHasDefaultValues {

    @Mock
    private SettingsHolder settingsHolder;

    @Test
    public void newCommentsConfigurationHasDefaultValues() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(Collections.emptyMap());
        assertThat(commentsConfiguration.getAllComments(), is(new HashMap<>()));

        Mockito.when(settingsHolder.getDefaultComments()).thenReturn(Collections.singletonMap("", Collections.emptyList()));
        when(settingsHolder.getDefaultComments()).thenReturn(Collections.emptyMap());
        assertThat(commentsConfiguration.getAllComments(), is(Collections.emptyMap()));

        Mockito.when(settingsHolder.getDefaultComments()).thenReturn(Collections.singletonMap("key", Arrays.asList("value")));
        when(settingsHolder.getDefaultComments()).thenReturn(Collections.emptyMap());
        assertThat(commentsConfiguration.getAllComments(), is(Collections.emptyMap()));
    }

}