package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert_NULL;
import static org.junit.Assert.assertTrue;
import static org.jsoup.helper.Validate.isValid;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedStripLeadingWhitespace_NoLeadingWhitespace {

    @Test
    public void stripLeadingWhitespace_NoLeadingWhitespace() {
        String input = "Hello World";
        assertEquals("Hello World", StringUtil.stripLeadingWhitespace(input));
    }

}