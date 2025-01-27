package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedAddNullPropertyDoesNotAlterMap {

    public static class ConfigMeException extends RuntimeException {
    }

    public void setup() {
        // No setup needed
    }

    @Test
    public void addNullPropertyDoesNotAlterMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        new PropertyListBuilder().add(null);
        assertEquals(map, new PropertyListBuilder().getRootEntries());
    }

}