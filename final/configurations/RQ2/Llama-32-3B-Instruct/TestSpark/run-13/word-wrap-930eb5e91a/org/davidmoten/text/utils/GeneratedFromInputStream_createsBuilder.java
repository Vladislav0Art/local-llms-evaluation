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
public class GeneratedFromInputStream_createsBuilder {

    @Mock
    private Reader reader;

    @InjectMocks
    private WordWrap wordWrap;

    @Test
    public void fromInputStream_createsBuilder() {
        byte[] bytes = {1, 2, 3};
        InputStream in = new ByteArrayInputStream(bytes);
        wordWrap = WordWrap.from(in, StandardCharsets.UTF_8);
        assertThat(wordWrap, is(WordWrap.class.getConstructor(InputStream.class, java.nio.charset.Charset.class).newInstance(in, StandardCharsets.UTF_8)));
    }

}