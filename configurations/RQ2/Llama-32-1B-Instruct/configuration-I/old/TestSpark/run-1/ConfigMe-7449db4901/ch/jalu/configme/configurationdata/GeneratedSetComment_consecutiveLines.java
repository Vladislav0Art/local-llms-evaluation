package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedSetComment_consecutiveLines {

    @Test
    public void setComment_consecutiveLines() {
        Map<String, List<String>> comments = Collections.singletonMap("path", Collections.singletonList(""));
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path", "/*Hello\nWorld*/");
        assertEquals(Collections.singletonList(List.of("", null)), configuration.getAllComments().values());
    }

}