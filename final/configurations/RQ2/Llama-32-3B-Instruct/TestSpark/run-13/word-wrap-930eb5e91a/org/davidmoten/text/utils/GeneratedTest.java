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
public class GeneratedTest {

    @Mock
    private Reader reader;

    @InjectMocks
    private WordWrap wordWrap;

    @Test
    public void fromReader_createsBuilder() {
        when(reader instanceof java.io.Reader).thenReturn(true);
        wordWrap = WordWrap.from(reader);
        assertThat(wordWrap, is(WordWrap.class.getConstructor(java.io.Reader.class).newInstance(null)));
    }

    @Test
    public void fromClasspathUtf8_createsBuilder() {
        String resource = "testResource";
        when(reader.equals(resource)).thenReturn(true);
        wordWrap = WordWrap.fromClasspathUtf8(resource);
        assertThat(wordWrap, is(WordWrap.class.getConstructor(String.class).newInstance(resource)));
    }

    @Test
    public void fromClasspath_createsBuilder() {
        String resource = "testResource";
        when(reader.equals(resource)).thenReturn(true);
        wordWrap = WordWrap.fromClasspath(resource, StandardCharsets.UTF_8);
        assertThat(wordWrap, is(WordWrap.class.getConstructor(String.class, java.nio.charset.Charset.class).newInstance(resource, StandardCharsets.UTF_8)));
    }

    @Test
    public void fromCharSequence_createsBuilder() {
        String text = "testText";
        wordWrap = WordWrap.from(text);
        assertThat(wordWrap, is(WordWrap.class.getConstructor(CharSequence.class).newInstance(text)));
    }

    @Test
    public void fromUtf8InputStream_createsBuilder() {
        byte[] bytes = {1, 2, 3};
        InputStream in = new ByteArrayInputStream(bytes);
        wordWrap = WordWrap.fromUtf8(in);
        assertThat(wordWrap, is(WordWrap.class.getConstructor(InputStream.class).newInstance(in)));
    }

    @Test
    public void fromInputStream_createsBuilder() {
        byte[] bytes = {1, 2, 3};
        InputStream in = new ByteArrayInputStream(bytes);
        wordWrap = WordWrap.from(in, StandardCharsets.UTF_8);
        assertThat(wordWrap, is(WordWrap.class.getConstructor(InputStream.class, java.nio.charset.Charset.class).newInstance(in, StandardCharsets.UTF_8)));
    }

    @Test
    public void fromFile_createsBuilder() {
        File file = new File("testFile");
        wordWrap = WordWrap.from(file, StandardCharsets.UTF_8);
        assertThat(wordWrap, is(WordWrap.class.getConstructor(File.class, java.nio.charset.Charset.class).newInstance(file, StandardCharsets.UTF_8)));
    }

    @Test
    public void fromReader_close() {
        boolean close = false;
        wordWrap = WordWrap.from(reader, close);
        when(reader.close()).thenReturn(close);
        try {
            wordWrap.close(reader);
            fail("Expected IOException");
        } catch (Exception e) {
        }
    }

    @Test
    public void isWhitespace_returnsFalseForNonWhitespaces() {
        String s = "testString";
        assertThat(WordWrap.isWhitespace(s), is(false));
    }

    @Test
    public void rightTrim_trimsLeftSideOfInputSequence() {
        StringBuilder word = new StringBuilder("  test");
        when(reader.equals(word)).thenReturn(true);
        String trimmed = WordWrap.rightTrim((StringBuilder) word);
        assertThat(trimmed, is("test"));
    }

}