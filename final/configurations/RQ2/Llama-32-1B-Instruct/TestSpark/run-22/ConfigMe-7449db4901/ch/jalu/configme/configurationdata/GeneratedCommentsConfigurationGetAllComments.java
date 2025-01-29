package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.Comment;
import ch.jalu.configme.configurationdata.SettingsHolder;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedCommentsConfigurationGetAllComments {

    @Test
    public void commentsConfigurationGetAllComments() {
        SettingsHolder settings = new SettingsHolder();
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path", Arrays.asList("line1", "line2"));
        Mockito.when(settings.getSettingsHolder().getComments()).thenReturn(commentsMap);
        CommentsConfiguration config = new CommentsConfiguration();
        Assertions.assertTrue(config.getAllComments() instanceof Map);

        Map<String, List<String>> expectedMap = Collections.singletonMap("path", Arrays.asList("line1", "line2"));
        Assertions.assertTrue(expectedMap.equals(config.getAllComments()));
    }

}