package ch.jalu.configme.configurationdata;

import org.junit.Test;

public class GeneratedTestGetSettings {

    @Test
    public void testGetSettings() {
        // Given
        String[] keys = {"key1", "key2"};

        // When
        SettingsHolder settings = new SettingsHolder();
        for (String key : keys) {
            settings.set(key, null);
        }

        // Then
        Object settingsValue = settings.get("key1");
        if (settingsValue instanceof String) {
            System.out.println(settingsValue);
        } else {
            throw new RuntimeException("Settings value is not a string");
        }
    }

}