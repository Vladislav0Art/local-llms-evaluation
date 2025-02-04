package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

public class GeneratedSetComment_test_NullPath {

    @Test
    public void setComment_test_NullPath() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertThrows(NullPointerException.class, () -> config.setComment(null, "comment1\ncomment2"));
    }

}