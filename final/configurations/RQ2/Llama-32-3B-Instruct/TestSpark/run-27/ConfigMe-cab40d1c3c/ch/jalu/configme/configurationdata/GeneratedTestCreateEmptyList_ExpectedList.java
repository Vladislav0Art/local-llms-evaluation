package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedTestCreateEmptyList_ExpectedList {

    @Test
    public void testCreateEmptyList_ExpectedList() {
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> expectedList = new ArrayList<>();
        assertEquals(expectedList, builder.create());
    }

    public static class ConfigMeException extends Exception {
    }

}