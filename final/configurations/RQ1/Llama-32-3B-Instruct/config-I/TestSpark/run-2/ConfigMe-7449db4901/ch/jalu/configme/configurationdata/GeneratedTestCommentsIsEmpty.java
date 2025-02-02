package ch.jalu.configme.configurationdata;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratedTestCommentsIsEmpty {

    private Map<String, List<String>> comments;

    public void setComments(Map<String, List<String>> comments) {
        this.comments = comments;
    }

    public Map<String, List<String>> getComments() {
        return comments;
    }

    public Map<String, List<String>> getAllComments() {
        return comments == null ? Collections.emptyMap() : comments;
    }
}

import java.util.Arrays;
import java.util.List;

public class CommentsConfigurationTest {

    @Test
    public void testCommentsIsEmpty() {
        // Given:
        CommentsConfiguration configuration = new CommentsConfiguration();

        // When:
        assertTrue(configuration.getAllComments().isEmpty());
    }

}