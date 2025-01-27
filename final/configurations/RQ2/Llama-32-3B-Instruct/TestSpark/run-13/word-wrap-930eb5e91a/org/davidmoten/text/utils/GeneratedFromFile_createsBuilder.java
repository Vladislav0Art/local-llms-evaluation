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
public class GeneratedFromFile_createsBuilder {

    @Mock
    private Reader reader;

    @InjectMocks
    private WordWrap wordWrap;

    @Test
    public void fromFile_createsBuilder() {
        File file = new File("testFile");
        wordWrap = WordWrap.from(file, StandardCharsets.UTF_8);
        assertThat(wordWrap, is(WordWrap.class.getConstructor(File.class, java.nio.charset.Charset.class).newInstance(file, StandardCharsets.UTF_8)));
    }

}