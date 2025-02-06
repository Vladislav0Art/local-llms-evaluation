package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private SettingsHolder settingsHolderMock;

    @Test
    public void constructor_test() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assert commentsConfiguration instanceof CommentsConfiguration;
    }

    @Test
    public void constructor_withMap_test() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("test", Arrays.asList("line1", "line2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        assert commentsConfiguration.getComments().containsKey("test");
    }

    @Test
    public void setComment_withPath_test() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        commentsConfiguration.setComment("test", "line1", "line2");
        assert commentsConfiguration.getComments().containsKey("test");
    }

    @Test
    public void setComment_withNewLine_test() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        commentsConfiguration.setComment("test", "", "line2");
        assert commentsConfiguration.getComments().get("test").size() == 1;
    }

    @Test
    public void getAllComments_test() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("test", Arrays.asList("line1", "line2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        Map<String, @UnmodifiableView List<String>> actual = commentsConfiguration.getAllComments();
        assert actual.containsKey("test");
    }

    @Test
    public void getAllComments_empty_test() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, @UnmodifiableView List<String>> actual = commentsConfiguration.getAllComments();
        assert actual.isEmpty();
    }

}