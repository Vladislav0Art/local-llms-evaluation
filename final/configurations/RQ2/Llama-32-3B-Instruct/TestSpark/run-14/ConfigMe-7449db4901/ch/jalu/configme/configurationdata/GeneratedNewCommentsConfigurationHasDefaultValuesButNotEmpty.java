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
public class GeneratedNewCommentsConfigurationHasDefaultValuesButNotEmpty {

    @Mock
    private SettingsHolder settingsHolder;

    @Test
    public void newCommentsConfigurationHasDefaultValuesButNotEmpty() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(Collections.singletonMap("", Collections.singletonList("")));

        assertThat(commentsConfiguration.getAllComments(), is(new HashMap<>() {
            {
                put("", Arrays.asList(""));
            }
        }));
    }

}