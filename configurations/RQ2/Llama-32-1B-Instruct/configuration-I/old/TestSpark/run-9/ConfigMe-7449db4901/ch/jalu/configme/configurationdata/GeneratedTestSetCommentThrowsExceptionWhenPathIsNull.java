package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedTestSetCommentThrowsExceptionWhenPathIsNull {

    @ParameterizedTest
    @CsvSource({
            "map1, map2",
            "map3, map4"
    })
    public void setComment_SingleNewLine(@Param<String>path, @Param<String>commentLines) {
        CommentsConfiguration config = new CommentsConfiguration();
        List<String> actual = config.setComment(path, commentLines);
        assertEquals(commentLines, actual);
        verify(null).setComment(path, commentLines);
    }

    @ParameterizedTest
    @CsvSource({
            "map1, map2",
            "map3, map4"
    })
    public void setComment_SingleNonNewLine(@Param<String>path, @Param<String>commentLines) {
        CommentsConfiguration config = new CommentsConfiguration();
        List<String> actual = config.setComment(path, commentLines);
        assertEquals(commentLines, actual);
        verify(null).setComment(path, commentLines);
    }

    @ParameterizedTest
    @CsvSource({
            "map1, map2",
            "map3, map4"
    })
    public void setComment_MultipleNewLines(@Param<String>path, @Param<String>commentLines) {
        CommentsConfiguration config = new CommentsConfiguration();
        List<String> actual = config.setComment(path, commentLines);
        assertEquals(commentLines, actual);
        verify(null).setComment(path, commentLines);
    }

    @ParameterizedTest
    @CsvSource({
            "map1, map2",
            "map3, map4"
    })
    public void setComment_MultipleNonNewLines(@Param<String>path, @Param<String>commentLines) {
        CommentsConfiguration config = new CommentsConfiguration();
        List<String> actual = config.setComment(path, commentLines);
        assertEquals(commentLines, actual);
        verify(null).setComment(path, commentLines);
    }

    @ParameterizedTest
    @CsvSource({
            "map1, map2",
            "map3, map4"
    })
    public void getAllComments_SingleNewLine(@Param<String>path) {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> actual = config.getAllComments(path);
        assertEquals(Collections.singletonMap(path, Collections.emptyList()), actual);
        verify(null).getAllComments(path);
    }

    @ParameterizedTest
    @CsvSource({
            "map1, map2",
            "map3, map4"
    })
    public void getAllComments_SingleNonNewLine(@Param<String>path) {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> actual = config.getAllComments(path);
        assertEquals(Collections.singletonMap(path, Collections.emptyList()), actual);
        verify(null).getAllComments(path);
    }

    @ParameterizedTest
    @CsvSource({
            "map1, map2",
            "map3, map4"
    })
    public void getAllComments_MultipleNewLines(@Param<String>path) {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> actual = config.getAllComments(path);
        assertEquals(Collections.singletonMap(path, Collections.emptyList()), actual);
        verify(null).getAllComments(path);
    }

    @ParameterizedTest
    @CsvSource({
            "map1, map2",
            "map3, map4"
    })
    public void getAllComments_MultipleNonNewLines(@Param<String>path) {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> actual = config.getAllComments(path);
        assertEquals(Collections.singletonMap(path, Collections.emptyList()), actual);
        verify(null).getAllComments(path);
    }

    @Test
    public void testSetCommentThrowsExceptionWhenPathIsNull() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = null;
        IllegalArgumentException expected = new IllegalArgumentException("path cannot be null");
        try {
            config.setComment(path, "comment");
            fail("Expected exception not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals(expected, e);
        }
    }

}