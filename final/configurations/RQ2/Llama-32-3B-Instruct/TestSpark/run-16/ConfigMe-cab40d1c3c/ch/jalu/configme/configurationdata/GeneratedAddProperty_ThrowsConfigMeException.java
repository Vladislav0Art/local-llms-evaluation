package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedAddProperty_ThrowsConfigMeException {

    @Test
    public void addProperty_ThrowsConfigMeException() {
        // given:
        PropertyListBuilder builder = new PropertyListBuilder();

        // when and then:
        assertThrows(ConfigMeException.class, () -> builder.addProperty(null));
    }

}