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
public class GeneratedFromUtf8InputStream_createsBuilder {

    @Mock
    private Reader reader;

    @InjectMocks
    private WordWrap wordWrap;

    @Test
    public void fromUtf8InputStream_createsBuilder() {
        byte[] bytes = {1, 2, 3};
        InputStream in = new ByteArrayInputStream(bytes);
        wordWrap = WordWrap.fromUtf8(in);
        assertThat(wordWrap, is(WordWrap.class.getConstructor(InputStream.class).newInstance(in)));
    }

}