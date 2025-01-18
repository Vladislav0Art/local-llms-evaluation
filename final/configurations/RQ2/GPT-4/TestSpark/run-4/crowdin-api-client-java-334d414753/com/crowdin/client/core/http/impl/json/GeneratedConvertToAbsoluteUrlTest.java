package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.sourcefiles.model.ExportOptions;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedConvertToAbsoluteUrlTest {

    @Test
    public void convertToAbsoluteUrlTest() {
        ExportOptions options = Mockito.mock(ExportOptions.class);
        when(options.getExportPattern()).thenReturn("pattern");
        when(options.getEscapeQuotes()).thenReturn(3);
        when(options.getExportOptions()).thenReturn(new Date());

        JacksonJsonTransformer transformer = new JacksonJsonTransformer();

        String json = null;
        try {
            json = transformer.convert(options);
        } catch (Exception e) {
            assertEquals("Conversion succeeded", e.getMessage());
        }

        assertEquals("{\"exportPattern\":\"pattern\",\"escapeQuotes\":3,\"exportOptions\":" + new Date() + "}", json);
    }

}