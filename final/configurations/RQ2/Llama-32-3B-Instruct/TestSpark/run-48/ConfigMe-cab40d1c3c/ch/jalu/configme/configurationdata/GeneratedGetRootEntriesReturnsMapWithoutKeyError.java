package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mockito;

public class GeneratedGetRootEntriesReturnsMapWithoutKeyError {

    @Test
    public void getRootEntriesReturnsMapWithoutKeyError() {
        Map<String, Object> map = new LinkedHashMap<>();
        Mockito.when(PropertyListBuilder.getRootEntries()).thenReturn(map);
        PropertyListBuilder builder = new PropertyListBuilder();
        try {
            builder.create();
            assert false;
        } catch (NullPointerException e) {
            assertThat(e.getMessage(), is("No root entries available"));
        }
    }

}