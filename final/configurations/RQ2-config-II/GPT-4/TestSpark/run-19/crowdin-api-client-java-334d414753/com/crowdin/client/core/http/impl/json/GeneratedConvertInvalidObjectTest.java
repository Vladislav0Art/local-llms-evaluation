package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedConvertInvalidObjectTest {

    private static final String VALID_JSON = "{\"name\":\"testFile.txt\",\"path\":\"testPath\"}";
    private static final String INVALID_JSON = "{\"name\"::\"testFile.txt\",,\"path\"::\"testPath\"}";
    private static final FileInfo FILE_INFO = new FileInfo("testFile.txt", "testPath");

    @Test
    public void convertInvalidObjectTest() throws Exception {
        JacksonJsonTransformer transformer = Mockito.spy(JacksonJsonTransformer.class);
        Mockito.doThrow(new CrowdinApiException("Exception")).when(transformer).convert(Mockito.any());

        transformer.convert(new Object());
    }

}