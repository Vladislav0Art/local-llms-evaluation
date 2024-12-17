package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class GeneratedSetComment_throwsNullPointerExceptionWhenLine1IsNull {

    @Test
    public void setComment_throwsNullPointerExceptionWhenLine1IsNull() {
        // Given
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        String path = "testPath";
        String commentLine2 = "line2";

        // When & Then
        assertThrows(NullPointerException.class, () -> commentsConfig.setComment(path, null, commentLine2));
    }

}