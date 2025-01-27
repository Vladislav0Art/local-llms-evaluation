package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRightTrim_trimsLeftSideOfInputSequence {

    @Mock
    private Reader reader;

    @InjectMocks
    private WordWrap wordWrap;

    @Test
    public void rightTrim_trimsLeftSideOfInputSequence() {
        StringBuilder word = new StringBuilder("  test");
        when(reader.equals(word)).thenReturn(true);
        String trimmed = WordWrap.rightTrim((StringBuilder) word);
        assertThat(trimmed, is("test"));
    }

}