package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.settings.SettingsHolder;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

public class GeneratedTestGetAllComments {

    @Test
    public void testGetAllComments() {
        CommentsConfigurationBuilder builder = new CommentsConfigurationBuilder();
        String comments = builder.build().toString();
        Map<String, List<String>> commentsMap = comments.split("\n");
        assert !commentsMap.isEmpty();
    }

}