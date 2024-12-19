package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetComment_Path_NullPath_ThrowsNPE {

    @Test
    public void setComment_Path_NullPath_ThrowsNPE() {
        CommentsConfiguration config = new CommentsConfiguration();
        String[] commentLines = {"line1", "line2"};
        try {
            config.setComment(null, commentLines);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

}