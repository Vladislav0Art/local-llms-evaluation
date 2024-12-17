package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.settings.SettingsHolder;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

public class GeneratedTestSetCommentLinesMultipleLines {

    @Test
    public void testSetCommentLinesMultipleLines() {
        CommentsConfigurationBuilder builder = new CommentsConfigurationBuilder();
        String comments = builder.build().toString();
        List<String> lines = comments.split("\n");
        assert (lines.length > 0);
        for (String line : lines) {
            assert !line.isEmpty();
        }
    }

}