package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

public class GeneratedConvertNullInputTest {

    @Test
    public void convertNullInputTest() throws JsonProcessingException {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        transformer.convert(null);
    }

}