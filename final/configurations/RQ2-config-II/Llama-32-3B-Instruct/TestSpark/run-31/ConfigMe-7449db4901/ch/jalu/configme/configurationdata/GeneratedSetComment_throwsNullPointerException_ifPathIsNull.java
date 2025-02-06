package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetComment_throwsNullPointerException_ifPathIsNull {

    @Test
    public void setComment_throwsNullPointerException_ifPathIsNull() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        assertThrows(NullPointerException.class, () -> commentsConfig.setComment(null, "line1"));
    }

}