package org.assertj.vavr.api;

import org.assertj.core.api.Assertions;
import org.assertj.vavr.api.SeqAssert;
import org.junit.Test;
import io.vavr.collection.List;
import io.vavr.collection.Seq;

public class GeneratedNewAbstractIterableAssertTest {

    @Test
    public void newAbstractIterableAssertTest() {
        Seq<String> actual = List.of("a", "b", "c");
        SeqAssert<String> assertions = new SeqAssert<>(actual);
        SeqAssert<String> newAssertions = assertions.newAbstractIterableAssert(actual);
        Assertions.assertThat(newAssertions).isNotNull();
    }

}