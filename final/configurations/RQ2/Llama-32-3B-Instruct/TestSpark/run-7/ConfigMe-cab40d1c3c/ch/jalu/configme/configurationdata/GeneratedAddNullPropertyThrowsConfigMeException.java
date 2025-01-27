package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedAddNullPropertyThrowsConfigMeException {

    public static class ConfigMeException extends RuntimeException {
    }

    public void setup() {
        // No setup needed
    }

    @Test
    public void addNullPropertyThrowsConfigMeException() {
        assertThrows(ConfigMeException.class, () -> new PropertyListBuilder().add(null));
    }

}