package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedSetComment_throwsNullPointerException_ifCommentLinesIsNull {

    @Test
    public void setComment_throwsNullPointerException_ifCommentLinesIsNull() {
        CommentsConfiguration config = mock(CommentsConfiguration.class);
        String path = "path";
        when(config.comments).thenReturn(new HashMap<>());
        when(config.comments.putAny()).thenThrow(NullPointerException::new);
        assertThrows(NullPointerException.class, () -> config.setComment(path, null));
    }

}