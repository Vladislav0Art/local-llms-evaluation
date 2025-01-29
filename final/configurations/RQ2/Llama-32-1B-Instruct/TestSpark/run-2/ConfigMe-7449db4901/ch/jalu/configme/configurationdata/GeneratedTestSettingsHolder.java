package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.CommentsConfigurationBuilder;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestSettingsHolder {

    @Test
    public void testSettingsHolder() {
        String path = "path/to/settings";
        Map<String, List<String>> settings = new HashMap<>();
        settings.put("setting", Collections.singletonList("value"));
        CommentsConfigurationBuilder builder = new CommentsConfigurationBuilder();
        builder.setComment(path, "", settings);
        assertEquals(1, builder.getAllComments().get(path).size());
    }

}