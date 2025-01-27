package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

public class GeneratedAddPropertyToList_NullAddedToEmptyList_ThrowsConfigMeException {

    @Test
    public void addPropertyToList_NullAddedToEmptyList_ThrowsConfigMeException() throws ConfigMeException {
        List<Property<?>> list = new ArrayList<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        try {
            builder.add(null);
            fail("Expected ConfigMeException");
        } catch (ConfigMeException e) {
        }

        assertEquals(0, list.size());
    }

}