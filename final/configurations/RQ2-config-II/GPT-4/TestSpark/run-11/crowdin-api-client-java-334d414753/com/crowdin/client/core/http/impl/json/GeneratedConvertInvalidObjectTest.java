package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConvertInvalidObjectTest {

    @Test
    public void convertInvalidObjectTest() throws Exception {
        // Given
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String invalidObject = "invalid object";

        // When
        String json = transformer.convert(invalidObject);

        // Then
        // Expect HttpException
    }

}