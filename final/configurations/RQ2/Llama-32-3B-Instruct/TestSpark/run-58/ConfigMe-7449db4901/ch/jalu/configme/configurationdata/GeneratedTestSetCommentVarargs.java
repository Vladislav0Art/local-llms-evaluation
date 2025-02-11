package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedTestSetCommentVarargs {

    public static final String PATH = "path";
    public static final List<String> COMMENT_LINES = Arrays.asList("line1", "line2");

    @Mock
    private SettingsHolder settingsHolder;

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void testSetCommentVarargs() {
        commentsConfiguration.setComment(PATH, COMMENT_LINES.toArray(new String[0]));
        Mockito.verify(settingsHolder).setComments(Mockito.anyMap());
    }
}

class CommentsConfiguration {
    private SettingsHolder settings;

    public void setComment(String path, String... lines) {
        // implement method
    }

    public Map<String, List<String>> getAllComments() {
        return settings.getComments();
    }
}

class SettingsHolder {
    private Map<String, List<String>> comments = new HashMap<>();

    public void setComments(Map<String, List<String>> comments) {
        this.comments.putAll(comments);
    }

    public Map<String, List<String>> getComments() {
        return comments;
    }

}