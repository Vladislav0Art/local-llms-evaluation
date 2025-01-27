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
public class GeneratedFromClasspathUtf8_createsBuilder {

    @Mock
    private Reader reader;

    @InjectMocks
    private WordWrap wordWrap;

    @Test
    public void fromClasspathUtf8_createsBuilder() {
        String resource = "testResource";
        when(reader.equals(resource)).thenReturn(true);
        wordWrap = WordWrap.fromClasspathUtf8(resource);
        assertThat(wordWrap, is(WordWrap.class.getConstructor(String.class).newInstance(resource)));
    }

}