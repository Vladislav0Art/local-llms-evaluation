package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mockito.Mockito;

public class GeneratedGetAllComments_emptyMap_test {

    @Test
    public void getAllComments_emptyMap_test() {
        CommentsConfiguration comments = new CommentsConfiguration();
        Map<String, List<String>> expected = Collections.emptyMap();
        assertEquals(expected, comments.getAllComments());
    }
}

public class MockitoHelper {

    public static <T> T mock(T type) {
        return Mockito.mock(type);
    }

    public static void configureMock(T mockObject, String methodName, Object... args) {
        Mockito.when(mockObject.getClass().getMethod(methodName, Object.class)).withArguments(args).thenReturn(null);
    }
}

public class CommentsConfiguration {

    private Map<String, List<String>> comments = new HashMap<>();

    public void setComment(String path, String comment) {
        if (!comments.containsKey(path)) {
            comments.put(path, new ArrayList<>());
        }
        comments.get(path).add(comment);
    }

    public Map<String, List<String>> getComments() {
        return comments;
    }

}