package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.settings.SettingsHolder;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

public class GeneratedTestGetAllCommentsNoComments {

    @Test
    public void testGetAllCommentsNoComments() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        Map<String, List<String>> commentsMap = configuration.getAllComments().toMap();
        assert commentsMap.isEmpty();
    }

}