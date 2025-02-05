package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void whenReaderIsValid_thenShouldReturnNonNullBuilder() {
        assertNotNull(WordWrap.from(new StringReader("Hello, World!")));
    }
}

@Test
public void whenResourceIsValid_thenShouldReturnNonNullBuilder() {
    assertNotNull(WordWrap.fromClasspathUtf8("resource.txt"));
}
	}

@Test
public void whenResourceAndCharsetAreValid_thenShouldReturnNonNullBuilder() {
    assertNotNull(WordWrap.fromClasspath("resource.txt", StandardCharsets.UTF_8));
}
	}

@Test
public void whenTextIsValid_thenShouldReturnNonNullBuilder() {
    assertNotNull(WordWrap.from("Hello, World!"));
}
	}

@Test
public void whenIOExceptionIsThrown_thenAssertionSucceeds() throws IOException {
    WordWrap.wordWrap(null, null, null, null, null, null, false, false);
}
	}

@Test
public void whenStringIsValid_thenShouldRemoveAllRightSpaces() {
    assertEquals("Hello, World!", WordWrap.rightTrim("Hello, World!     "));
}
	}

@Test
public void whenStringIsWhitespace_thenShouldReturnTrue() {
    assertTrue(WordWrap.isWhitespace("           "));
}

@Test
public void whenStringIsNotWhitespace_thenShouldReturnFalse() {
    assertFalse(WordWrap.isWhitespace("Not Whitespace"));
}
	}

@Test
public void whenStringIsValid_thenShouldRemoveAllLeftSpaces() {
    assertEquals("Hello, World!", WordWrap.leftTrim(new StringBuilder2("     Hello, World!")));
}

}