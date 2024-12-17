package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GeneratedTestGetAllComments {

    @UnmodifiableView
    private Map<String, List<String>> comments = new HashMap<>();

    public boolean isCommentsUnmodifiable() {
        return comments == null ? true : false;
    }

    @Test
    public void testGetAllComments() {
        Map<String, List<String>> comments = this.comments;
        assertThat(comments).isNotNull();
        assert com.is().isUnmodifiableView(comments);
    }

}