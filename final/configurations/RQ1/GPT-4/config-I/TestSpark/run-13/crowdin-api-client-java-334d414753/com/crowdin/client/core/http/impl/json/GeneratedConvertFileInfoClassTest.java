package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedConvertFileInfoClassTest {

    private JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void convertFileInfoClassTest() {
        FileInfo fileInfo = new FileInfo();
        fileInfo.setPath("/test/dir/file.txt");

        String json = transformer.convert(fileInfo);
        String expectedJson = "{'path':'/test/dir/file.txt'}".replace("'", "\"");

        Assert.assertNotNull(json);
        Assert.assertEquals(expectedJson, json);
    }

}