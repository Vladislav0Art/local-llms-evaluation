package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetAllComments_EmptyLine {

    @Test
    public void setAllComments_EmptyLine() {
        // given
        CommentsConfiguration config = new CommentsConfiguration();
        List<String> comments = Arrays.asList("");

        // when
        config.setAllComments(comments);

        // then
        assertEquals(comments, config.getAllComments());
    }
}

class CommentsConfiguration {

    private Map<String, List<String>> allComments;

    public void setAllComments(List<String> comments) {
        this.allComments = new HashMap<>(comments);
    }

    public java.util.Map<String,@javax.annotation.UnmodifiableList<java.lang.String>>

    getAllComments() {
        return Collections.unmodifiableMap(this.allComments);
    }

}