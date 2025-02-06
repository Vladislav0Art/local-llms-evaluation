package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConstructor_withMap_test {

    @Mock
    private SettingsHolder settingsHolderMock;

    @Test
    public void constructor_withMap_test() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("test", Arrays.asList("line1", "line2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        assert commentsConfiguration.getComments().containsKey("test");
    }

}