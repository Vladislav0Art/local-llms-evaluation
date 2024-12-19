package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlHead_AppendsCommentToOutput_WithData {

    @Mock
    private Appendable accum;

    @Test
    public void outerHtmlHead_AppendsCommentToOutput_WithData() throws IOException {
        // given
        when(accum.append(anyString())).thenReturn(this.accum);

        // when
        new Comment("<!-- This is a comment -->").outerHtmlHead(accum, 0, null);

        // then
        accum.assertTextMatches("<!--This is a comment-->");
    }

}