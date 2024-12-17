package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedComments_configuration_multilineComment {

    @Test
    public void comments_configuration_multilineComment() {
        Map<String, List<String>> comments = Collections.singletonMap("path", Collections.singletonList(""));
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path", "/*\nHello\nWorld*/");
        assertEquals(Collections.singletonList(List.of("", null)), configuration.getAllComments().values());
    }

}