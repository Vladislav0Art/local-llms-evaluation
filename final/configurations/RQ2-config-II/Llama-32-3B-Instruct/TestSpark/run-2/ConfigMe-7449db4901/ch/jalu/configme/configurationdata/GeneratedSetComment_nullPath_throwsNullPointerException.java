package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

public class GeneratedSetComment_nullPath_throwsNullPointerException {

    @Test
    public void setComment_nullPath_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new CommentsConfiguration().setComment(null, "comment"));
    }

}