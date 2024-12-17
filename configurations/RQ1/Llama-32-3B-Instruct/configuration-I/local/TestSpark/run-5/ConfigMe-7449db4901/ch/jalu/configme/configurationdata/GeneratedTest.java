package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GeneratedTest {

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

class UnmodifiableView<T> {
    private T obj;

    public UnmodifiableView(T obj) {
        this.obj = obj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UnmodifiableView)) return false;
        UnmodifiableView<?> that = (UnmodifiableView<?>) o;
        return java.util.Objects.equals(obj, that.obj);
    }
}

class CommentsConfiguration {
    private Map<String, List<String>> comments;

    public CommentsConfiguration() {
        this.comments = new HashMap<>();
    }

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