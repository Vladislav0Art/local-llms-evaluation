package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void newCommentsConfiguration_isEmpty() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> comments = config.getAllComments();
        assertThat(comments, is(Collections.emptyMap()));
    }

    @Test
    public void newCommentsConfiguration_fromHashMap_isInitializedCorrectly() {
        String path = "path";
        Map<String, List<String>> comments = Arrays.asList(path, path).stream().map(key -> Arrays.asList("a", "b")).collect(Collectors.toMap(String::valueOf, key -> key));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        Map<String, @UnmodifiableView List<String>> actualComments = config.getAllComments();
        assertThat(actualComments, is(Maps.newHashMapWithExpectedKeySet(Arrays.asList(path))));
    }

    @Test
    public void setComment_overwritesExisting() {
        String path = "path";
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> comments = Arrays.asList(path).stream().map(key -> Arrays.asList("a", "b")).collect(Collectors.toMap(String::valueOf, key -> key));
        config.setComment(path, "c");
        Map<String, @UnmodifiableView List<String>> actualComments = config.getAllComments();
        assertThat(actualComments, is(Maps.newHashMapWithExpectedKeySet(Arrays.asList(path))));
    }

    @Test
    public void setComment_addsNewLines() {
        String path = "path";
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> comments = Arrays.asList(path).stream().map(key -> Arrays.asList("a", "b")).collect(Collectors.toMap(String::valueOf, key -> key));
        config.setComment(path, "c", "d");
        Map<String, @UnmodifiableView List<String>> actualComments = config.getAllComments();
        assertThat(actualComments.get(path), is(Arrays.asList("a", "b", "c", "d")));
    }

    @Test
    public void setComment_addsEmptyLines() {
        String path = "path";
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> comments = Arrays.asList(path).stream().map(key -> Arrays.asList("a", "b")).collect(Collectors.toMap(String::valueOf, key -> key));
        config.setComment(path, "", "");
        Map<String, @UnmodifiableView List<String>> actualComments = config.getAllComments();
        assertThat(actualComments.get(path), is(Arrays.asList("", "", "", "")));
    }

    @Test
    public void setComment_multiplePaths() {
        String path1 = "path1";
        String path2 = "path2";
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> comments = Arrays.asList(path1).stream().map(key -> Arrays.asList("a", "b")).collect(Collectors.toMap(String::valueOf, key -> key));
        Map<String, @UnmodifiableView List<String>> actualComments = config.setComment(path2, "c");
        Map<String, @UnmodifiableView List<String>> expectedComments = new HashMap<>();
        expectedComments.put(path1, Arrays.asList("a", "b"));
        expectedComments.put(path2, Arrays.asList("c"));
        assertThat(config.getAllComments(), is(expectedComments));
    }

}