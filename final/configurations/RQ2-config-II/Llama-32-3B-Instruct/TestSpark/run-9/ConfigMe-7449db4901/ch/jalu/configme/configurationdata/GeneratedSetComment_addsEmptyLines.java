package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedSetComment_addsEmptyLines {

    @Test
    public void setComment_addsEmptyLines() {
        String path = "path";
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> comments = Arrays.asList(path).stream().map(key -> Arrays.asList("a", "b")).collect(Collectors.toMap(String::valueOf, key -> key));
        config.setComment(path, "", "");
        Map<String, @UnmodifiableView List<String>> actualComments = config.getAllComments();
        assertThat(actualComments.get(path), is(Arrays.asList("", "", "", "")));
    }

}