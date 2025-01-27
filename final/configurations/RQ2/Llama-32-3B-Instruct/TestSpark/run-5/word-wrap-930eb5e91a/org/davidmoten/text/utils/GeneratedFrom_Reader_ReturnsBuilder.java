package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedFrom_Reader_ReturnsBuilder {

    @Mock
    private Reader reader;

    public static class Builder {
        // implementation
    }

    @Test
    public void from_Reader_ReturnsBuilder() {
        Preconditions.checkNotNull(WordWrap.Builder.from(reader), "Expected a non-null value");
    }

}