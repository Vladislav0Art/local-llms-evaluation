package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.List;

public class GeneratedSetComment_duplicateLines_fails {

    @Test
    public void setComment_duplicateLines_fails() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        String path = "test";
        String commentLines[] = {"#line1", "#line1"};
        assertThrows(NullPointerException.class, () -> configuration.setComment(path, commentLines));
    }

}