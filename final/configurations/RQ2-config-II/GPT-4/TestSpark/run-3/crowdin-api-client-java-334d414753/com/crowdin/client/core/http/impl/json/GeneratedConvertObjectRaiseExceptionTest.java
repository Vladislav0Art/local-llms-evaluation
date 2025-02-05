package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedConvertObjectRaiseExceptionTest {

    private final JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void convertObjectRaiseExceptionTest() {
        FileInfo fileInfo = new FileInfo();
        fileInfo.setName(null);
        assertThrows(HttpException.class, () -> transformer.convert(fileInfo));
    }

}