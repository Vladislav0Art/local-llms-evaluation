package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void constructorCreatesEmptyMap() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        assertTrue(commentsConfig.getAllComments().isEmpty());
    }

    @Test
    public void constructorCreatesMapFromArguments() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path1", Collections.singletonList("commentLine"));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(commentsMap);
        assertEquals(commentsMap, commentsConfig.getAllComments());
    }

    @Test
    public void setCommentSetsNewLines() {
        Map<String, List<String>> allComments = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration(allComments);
        commentsConfig.setComment("path1", "commentLine");
        assertEquals(Collections.singletonList("commentLine"), commentsConfig.getAllComments().get("path1"));
    }

    @Test
    public void setCommentSetsEmptyLines() {
        Map<String, List<String>> allComments = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration(allComments);
        commentsConfig.setComment("path1", "");
        assertEquals(Collections.emptyList(), commentsConfig.getAllComments().get("path1"));
    }

    @Test
    public void setCommentSetsMultipleLines() {
        Map<String, List<String>> allComments = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration(allComments);
        commentsConfig.setComment("path1", "commentLine1", "commentLine2");
        assertEquals(List.of("commentLine1", "commentLine2"), commentsConfig.getAllComments().get("path1"));
    }

    @Test
    public void setCommentSetsSamePathMultipleTimes() {
        Map<String, List<String>> allComments = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration(allComments);
        commentsConfig.setComment("path1", "commentLine1");
        commentsConfig.setComment("path1", "commentLine2");
        assertEquals(List.of("commentLine1", "commentLine2"), commentsConfig.getAllComments().get("path1"));
    }

    @Test
    public void setCommentSetsDifferentPath() {
        Map<String, List<String>> allComments = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration(allComments);
        commentsConfig.setComment("path1", "commentLine");
        commentsConfig.setComment("path2", "anotherComment");
        assertEquals(Map.of("path1", List.of("commentLine"), "path2", Collections.singletonList("anotherComment")), commentsConfig.getAllComments());
    }

    @Test
    public void getAllCommentsReturnsUnmodifiableMap() {
        Map<String, List<String>> allComments = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration(allComments);
        Object allCommentsObject = commentsConfig.getAllComments();
        assertTrue(allCommentsObject instanceof UnmodifiableMapView);
        assertNotSame(allCommentsObject, commentsConfig.getAllComments());
    }
}

@Test
public void constructorCreatesEmptyMap() {
    // implementation
}

@Test
public void constructorCreatesMapFromArguments() {
    // implementation
}

@Test
public void setCommentSetsNewLines() {
    // implementation
}

@Test
public void setCommentSetsEmptyLines() {
    // implementation
}

@Test
public void setCommentSetsMultipleLines() {
    // implementation
}

@Test
public void setCommentSetsSamePathMultipleTimes() {
    // implementation
}

@Test
public void setCommentSetsDifferentPath() {
    // implementation
}

@Test
public void getAllCommentsReturnsUnmodifiableMap() {
    // implementation
}

}