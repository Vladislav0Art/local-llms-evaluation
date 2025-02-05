package com.crowdin.client.core.http.impl.json;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import com.crowdin.client.sourcefiles.model.FileInfo;

public class GeneratedConvertValidObjectTest {

    @Test
    public void convertValidObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        FileInfo fileInfo = new FileInfo();
        fileInfo.setName("test.txt");
        fileInfo.setSize(100L);

        String jsonString = transformer.convert(fileInfo);

        assertNotNull(jsonString);
        assertTrue(jsonString.contains("\"name\":\"test.txt"));
        assertTrue(jsonString.contains("\"size\":100"));
    }

}