package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedJsonToFileInfo {

    @Test
    public void jsonToFileInfo() {
        JacksonJsonFromFileInfo jacksonJsonFromFileInfo = new JacksonJsonFromFileInfo();
        JacksonJsonToFileInfo jacksonJsonToFileInfo1 = new JacksonJsonToFileInfo();
        assertEquals("{\"name\":\"My File\",\"size\":123,\"path\":\"/my/file\"}", jacksonJsonToFileInfo.toFileInfo("My File", 123, "/my/file"));
    }

}