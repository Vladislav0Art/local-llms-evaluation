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

public class GeneratedParseNonexistentClassTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private final JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parseNonexistentClassTest() throws Exception {
        expectedException.expect(CrowdinApiException.class);
        expectedException.expectMessage("Could not read JSON: Could not initialize class com.crowdin.client.nonExistentClass");

        // Error expected since `nonExistentClass` does not exist
        jacksonJsonTransformer.parse("{}", Class.forName("com.crowdin.client.nonExistentClass"));
    }

}