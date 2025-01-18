package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.sourcefiles.model.ExportOptions;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedConvertNullInputTest {

    @Test
    public void convertNullInputTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        transformer.convert(null);
    }

}