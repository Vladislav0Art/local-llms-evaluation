package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedParseExceptionWhenInvalidJsonTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private final JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parseExceptionWhenInvalidJsonTest() throws Exception {
        expectedException.expect(CrowdinApiException.class);
        expectedException.expectMessage("Could not read JSON: Unrecognized token 'InvalidJson': was expecting ('true', 'false' or 'null')");

        jacksonJsonTransformer.parse("InvalidJson", Project.class);
    }

}