package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNewInstanceIsEmpty {

    @Mock
    private SettingsHolder settingsHolder;

    @Mock
    private Map<String, List<String>> comments;

    public CommentsConfiguration getCommentsConfiguration() {
        return new CommentsConfiguration(comments);
    }

    @Test
    public void newInstanceIsEmpty() {
        CommentsConfiguration instance = new CommentsConfiguration();
        assertTrue(instance.getAllComments().isEmpty());
    }

}