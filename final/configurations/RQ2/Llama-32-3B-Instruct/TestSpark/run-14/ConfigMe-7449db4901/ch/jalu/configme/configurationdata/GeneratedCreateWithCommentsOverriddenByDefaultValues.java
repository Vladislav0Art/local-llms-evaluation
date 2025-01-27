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
public class GeneratedCreateWithCommentsOverriddenByDefaultValues {

    @Mock
    private SettingsHolder settingsHolder;

    @Test
    public void createWithCommentsOverriddenByDefaultValues() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(Collections.emptyMap());
        when(settingsHolder.getDefaultComments()).thenReturn(Collections.singletonMap("key", Collections.singletonList("value")));
        when(settingsHolder.getDefaultComments()).thenReturn(Collections.emptyMap());

        Map<String, List<String>> result = new HashMap<>();
        result.put("", Arrays.asList(""));
        result.put("key", Arrays.asList("value"));
        commentsConfiguration.setComment("key", "value");
        when(settingsHolder.getDefaultComments()).thenReturn(result);

        assertThat(commentsConfiguration.getAllComments(), is(result));
    }

}