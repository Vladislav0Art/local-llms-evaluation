package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

public class GeneratedTest {

    @Test
    public void fromClasspathUtf8Test() {
        Builder builder = WordWrap.fromClasspathUtf8("testdata.txt");
        assertNotNull(builder);
    }

    @Test
    public void fromInvalidFileTest() {
        exception.expect(IORuntimeException.class);
        WordWrap.from(new File("doesnotexist.txt"), StandardCharsets.UTF_8);
    }

    @Test
    public void closeInvalidReaderTest() {
        exception.expect(IORuntimeException.class);
        WordWrap.close(null);
    }

    @Test
    public void wrapIOExceptionTest() throws Exception {
        StringReader reader = new StringReader("test");
        WordWrap.from(reader).wrap((File) null, null);
    }

    @Test
    public void BuilderConstructorTest() {
        Builder builder = new Builder(new StringReader(""), true);
        assertNotNull(builder);
    }

    @Test
    public void BuilderSetInsertHyphensTest() {
        Builder builder = WordWrap.from("test text");
        builder.insertHyphens(false);
        String result = builder.wrap();
        assertEquals("test text", result);
    }

    @Test
    public void BuilderSetBreakWordsTest() {
        Builder builder = WordWrap.from("test text");
        builder.breakWords(false);
        String result = builder.wrap();
        assertEquals("test text", result);
    }

    @Test
    public void BuilderIncludeAndExcludeExtraWordCharsTest() {
        Set<Character> chars = new HashSet<>();
        chars.add('!');
        chars.add('^');
        chars.add('*');
        Builder builder = WordWrap.from("Here is a test! It should^return*this*string");
        builder.extraWordChars(chars);
        builder.includeExtraWordChars("%!");
        builder.excludeExtraWordChars("^");
        String result = builder.wrap();
        assertEquals("Here is a test! It should^return*this*string", result);
    }

    @Test
    public void BuilderWrapToStringTest() {
        Builder builder = WordWrap.from("Here is a test! It should return this string.");
        String result = builder.wrap();
        assertEquals("Here is a test! It should return this string.", result);
    }

    @Test
    public void BuilderSetInvalidMaxWidthTest() {
        WordWrap.from("test").maxWidth(0);
    }

    @Test
    public void BuilderWrapWrittenToStreamTest() throws Exception {
        Builder builder = WordWrap.from("Some text to be tested");
        StringWriter sw = new StringWriter();

        builder.wrap(sw);
        assertEquals("Some text to be tested", sw.toString());
    }

    @Test
    public void BuilderWrapToListTest() throws Exception {
        Builder builder = WordWrap.from("Some text to be tested").maxWidth(5);

        List<String> actualList = builder.wrapToList();
        List<String> expectedList = Arrays.asList("Some", "text ", "to be", "test-", "ed");

        assertEquals(expectedList, actualList);
    }

}