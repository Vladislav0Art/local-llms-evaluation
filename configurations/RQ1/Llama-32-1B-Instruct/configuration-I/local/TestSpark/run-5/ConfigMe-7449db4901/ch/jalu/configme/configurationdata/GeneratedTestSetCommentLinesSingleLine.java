package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.settings.SettingsHolder;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

public class GeneratedTestSetCommentLinesSingleLine {

    @Test
    public void testSetCommentLinesSingleLine() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path", "\n comment line 1\n");
        List<String> lines = configuration.getAllComments().values().stream()
                .map(List::size).toArray(Integer[]::new);
        assert (lines.length == 2 && lines[0] == "comment line 1" && lines[1] == "");
    }

}