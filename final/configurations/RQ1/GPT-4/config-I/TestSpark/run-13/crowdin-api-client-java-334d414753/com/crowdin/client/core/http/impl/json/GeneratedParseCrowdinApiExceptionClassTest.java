package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseCrowdinApiExceptionClassTest {

    private JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void parseCrowdinApiExceptionClassTest() {
        String json = "{\"message\":\"API exception message\"}";
        CrowdinApiException crowdinApiException = transformer.parse(json, CrowdinApiException.class);

        Assert.assertNotNull(crowdinApiException);
        Assert.assertEquals("API exception message", crowdinApiException.getMessage());
    }

}