package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.mockito.Mockito.when;

public class GeneratedSetCommentForNewPathAddsNewEntry {

    private Map<String, List<String>> comments = new HashMap<>();

    public void setComment(String path, String commentLine) {
        if (!comments.containsKey(path)) {
            comments.put(path, new ArrayList<>());
        }
        comments.get(path).add(commentLine);
    }

    public Map<String, List<String>> getAllComments() {
        return Collections.unmodifiableMap(comments);
    }

}

public class CommentsConfigurationTest {

    @Test
    public void setCommentForNewPathAddsNewEntry() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        String commentLine = "comment";
        configuration.setComment("new path", commentLine);
        Map<String, List<String>> comments = configuration.getAllComments();
        assertThat(comments.get("new path"), is(List.of(commentLine)));
    }

}