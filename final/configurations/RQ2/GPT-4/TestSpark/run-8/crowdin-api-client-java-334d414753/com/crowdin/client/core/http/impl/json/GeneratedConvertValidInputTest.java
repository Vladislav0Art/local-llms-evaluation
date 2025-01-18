package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

public class GeneratedConvertValidInputTest {

    @Test
    public void convertValidInputTest() throws JsonProcessingException {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        FileInfo fileInfo = new FileInfo();
        fileInfo.setName("test_file");
        String json = transformer.convert(fileInfo);
        Assert.assertTrue(json.contains("\"name\":\"test_file\""));
    }

}