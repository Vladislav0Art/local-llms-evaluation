package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedComments_configuration_emptyMap {

    @Test
    public void comments_configuration_emptyMap() {
        Map<String, List<String>> comments = Collections.emptyMap();
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path", "");
        assertNull(configuration.getAllComments());
    }

}