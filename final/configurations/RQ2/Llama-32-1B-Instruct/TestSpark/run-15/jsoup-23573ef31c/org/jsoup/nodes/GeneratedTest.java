package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    private TestSpark spark = new TestSpark();

    @Test
    public void testTitleMatches() throws Exception {
        assertEquals("Example", addTest(new DocumentExpectation()).addTest(document).before());
        assertEquals("New Title", addTest(new DocumentExpectation()).addTest(document).after());
    }

    private TestSpark addTest(DocumentExpectation expectation) throws Exception {
        return spark.addTest(expectation);
    }

    @Test
    public void testTitleDoesNotMatch() throws Exception {
        addTest(new DocumentExpectation().before()).addTest(document).after();
        assertEquals("Example", addTest(new DocumentExpectation().before()).addTest(document).after());
        assertThrows(RuntimeException.class, () -> addTest(new DocumentExpectation().before()));
    }

    private TestSpark addTest(DocumentExpectation expectation) throws Exception {
        return spark.addTest(expectation);
    }

}