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
public class GeneratedFromClasspath_createsBuilder {

    @Mock
    private Reader reader;

    @InjectMocks
    private WordWrap wordWrap;

    @Test
    public void fromClasspath_createsBuilder() {
        String resource = "testResource";
        when(reader.equals(resource)).thenReturn(true);
        wordWrap = WordWrap.fromClasspath(resource, StandardCharsets.UTF_8);
        assertThat(wordWrap, is(WordWrap.class.getConstructor(String.class, java.nio.charset.Charset.class).newInstance(resource, StandardCharsets.UTF_8)));
    }

}