package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class GeneratedAppendKeyVal_SimpleScenario {

    @Mock
    private Connection.KeyVal kv;

    @Test
    public void appendKeyVal_SimpleScenario() {
        // Given
        String url = "https://example.com/path";

        // When
        UrlBuilder builder = new UrlBuilder(url);
        builder.appendKeyVal(kv);

        // Then
        expect(builder.build()).andReturn(url);
    }

}