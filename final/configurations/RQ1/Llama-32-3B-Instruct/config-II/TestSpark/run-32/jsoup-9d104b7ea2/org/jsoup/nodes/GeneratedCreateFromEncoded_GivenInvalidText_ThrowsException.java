package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateFromEncoded_GivenInvalidText_ThrowsException {

    @Mock
    private LeafNode parentNode;

    @Mock
    private Element parent;

    @Test
    public void createFromEncoded_GivenInvalidText_ThrowsException() {
        String invalidText = "Invalid HTML";
        when(Entities.unescape(invalidText)).thenReturn("");
        assertThat(() -> TextNode.createFromEncoded(invalidText), throws(IOException.class));
    }

}