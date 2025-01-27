package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedSetComment_throwsNullPointerException_ifPathIsEmpty {

    @Test
    public void setComment_throwsNullPointerException_ifPathIsEmpty() {
        Map<String, List<String>> comments = new HashMap<>();
        String path = "";
        assertThrows(NullPointerException.class, () -> new CommentsConfiguration(comments).setComment(path, Arrays.asList("line1", "")));
    }

}