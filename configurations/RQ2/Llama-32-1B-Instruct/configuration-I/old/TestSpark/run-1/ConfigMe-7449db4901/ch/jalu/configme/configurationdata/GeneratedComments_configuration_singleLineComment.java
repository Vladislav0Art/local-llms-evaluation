package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedComments_configuration_singleLineComment {

    @Test
    public void comments_configuration_singleLineComment() {
        Map<String, List<String>> comments = Collections.singletonMap("path", Collections.singletonList(""));
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path", "/*");
        assertEquals(Collections.emptyList(), configuration.getAllComments().values());
    }

}