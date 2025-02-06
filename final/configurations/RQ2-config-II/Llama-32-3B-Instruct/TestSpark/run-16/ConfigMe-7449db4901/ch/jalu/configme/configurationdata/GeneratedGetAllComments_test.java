package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetAllComments_test {

    @Mock
    private SettingsHolder settingsHolderMock;

    @Test
    public void getAllComments_test() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("test", Arrays.asList("line1", "line2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        Map<String, @UnmodifiableView List<String>> actual = commentsConfiguration.getAllComments();
        assert actual.containsKey("test");
    }

}