package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

public class GeneratedCreateFromEncodedUnescapesText {

    @Test
    public void createFromEncodedUnescapesText() {
        String encodedText = "&lt;Hello World&gt;";
        when(StringUtil.unescape(encodedText)).thenReturn("Hello World");
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertThat(textNode.text(), is("Hello World"));
    }

}