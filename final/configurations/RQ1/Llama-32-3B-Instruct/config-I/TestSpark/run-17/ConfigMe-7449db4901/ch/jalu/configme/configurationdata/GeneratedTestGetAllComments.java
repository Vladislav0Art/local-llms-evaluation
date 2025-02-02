package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedTestGetAllComments {

    private static class SettingsHolder {
        public String registerComments(String key, String value) {
            return "";
        }
    }

    @Test
    public void testGetAllComments() {
        // setup
        SettingsHolder settingsHolder = new SettingsHolder();
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(settingsHolder);

        // exercise
        Map<String, List<String>> commentsMap = commentsConfiguration.getAllComments();

        // verify
        assert commentsMap != null;
    }

}

class CommentsConfiguration {

    private final Map<String, List<String>> commentsMap;

    public CommentsConfiguration() {
    }

    public void setComment(String comment) {
        // logic to set the comment
    }

    public synchronized Map<String, List<String>> getAllComments() {
        return commentsMap;
    }

}