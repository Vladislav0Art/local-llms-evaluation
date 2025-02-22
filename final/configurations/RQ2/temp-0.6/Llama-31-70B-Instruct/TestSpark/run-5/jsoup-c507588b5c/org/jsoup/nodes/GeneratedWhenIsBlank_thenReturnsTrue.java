package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedWhenIsBlank_thenReturnsTrue {

    @Mock
    private LeafNode leafNodeMock;

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("");
    }

    @Test
    public void whenIsBlank_thenReturnsTrue() {
        textNode.text("");
        assertThat(textNode.isBlank(), is(true));
    }

}