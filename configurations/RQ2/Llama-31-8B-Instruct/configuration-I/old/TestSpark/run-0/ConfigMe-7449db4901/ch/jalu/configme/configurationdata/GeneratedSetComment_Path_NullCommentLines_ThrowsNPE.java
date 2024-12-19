package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetComment_Path_NullCommentLines_ThrowsNPE {

    @Test
    public void setComment_Path_NullCommentLines_ThrowsNPE() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "path";
        try {
            commentsConfiguration.setComment(path, null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

}