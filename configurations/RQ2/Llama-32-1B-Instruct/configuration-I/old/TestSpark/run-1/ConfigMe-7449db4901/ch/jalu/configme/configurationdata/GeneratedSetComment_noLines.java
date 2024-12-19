package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedSetComment_noLines {

    @Test
    public void setComment_noLines() {
        Map<String, List<String>> comments = Collections.singletonMap("path", Collections.emptyList());
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path", "");
        assertEquals(Collections.emptyList(), configuration.getAllComments().values());
    }

}