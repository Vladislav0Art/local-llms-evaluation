package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.mockito.Mockito.when;

public class GeneratedSetCommentForNewPathAddsEmptyLineIfNoMarker {

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
    public void setCommentForNewPathAddsEmptyLineIfNoMarker() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        String[] commentLines = {"--", "", "--"};
        String emptyLine = "";
        for (String line : commentLines) {
            if (!line.equals("--")) {
                continue;
            }
            configuration.setComment("new path", emptyLine);
        }
        Map<String, List<String>> comments = configuration.getAllComments();
        assertThat(comments.get("new path"), is(List.of(emptyLine)));
    }

}