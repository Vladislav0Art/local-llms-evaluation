package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedConvertNullTest {

    private JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void convertNullTest() {
        transformer.convert(null);
    }

}