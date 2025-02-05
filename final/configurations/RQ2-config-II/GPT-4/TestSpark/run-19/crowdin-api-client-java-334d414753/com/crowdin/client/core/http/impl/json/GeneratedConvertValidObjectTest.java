package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedConvertValidObjectTest {

    private static final String VALID_JSON = "{\"name\":\"testFile.txt\",\"path\":\"testPath\"}";
    private static final String INVALID_JSON = "{\"name\"::\"testFile.txt\",,\"path\"::\"testPath\"}";
    private static final FileInfo FILE_INFO = new FileInfo("testFile.txt", "testPath");

    @Test
    public void convertValidObjectTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = transformer.convert(FILE_INFO);
        Assert.assertEquals(VALID_JSON, json);
    }

}