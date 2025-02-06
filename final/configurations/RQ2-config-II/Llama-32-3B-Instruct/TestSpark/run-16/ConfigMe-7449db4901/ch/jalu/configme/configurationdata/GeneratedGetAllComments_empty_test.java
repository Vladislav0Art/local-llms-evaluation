package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetAllComments_empty_test {

    @Mock
    private SettingsHolder settingsHolderMock;

    @Test
    public void getAllComments_empty_test() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, @UnmodifiableView List<String>> actual = commentsConfiguration.getAllComments();
        assert actual.isEmpty();
    }

}