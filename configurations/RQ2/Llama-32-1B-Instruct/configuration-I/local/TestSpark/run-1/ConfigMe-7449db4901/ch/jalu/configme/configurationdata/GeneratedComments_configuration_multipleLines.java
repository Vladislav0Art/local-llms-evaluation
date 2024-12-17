package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedComments_configuration_multipleLines {

    @Test
    public void comments_configuration_multipleLines() {
        Map<String, List<String>> comments = Collections.singletonMap("path", Collections.singletonList(""));
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path", "/*\nHello\nWorld*/");
        assertEquals(Collections.singletonList(List.of("", null)), configuration.getAllComments().values());
    }

}