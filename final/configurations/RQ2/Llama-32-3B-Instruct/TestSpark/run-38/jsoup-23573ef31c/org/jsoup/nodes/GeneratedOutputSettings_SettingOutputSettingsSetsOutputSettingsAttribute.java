package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedOutputSettings_SettingOutputSettingsSetsOutputSettingsAttribute {

    @Test
    public void outputSettings_SettingOutputSettingsSetsOutputSettingsAttribute() {
        OutputSettings outputSettings = OutputSettings.CANONICAL;
        Document document = new Document("");
        document.outputSettings(outputSettings);
        assertEquals(outputSettings, document.outputSettings());
    }

}