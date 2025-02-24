package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void buildNoDirectivesTest() {
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(null, null);
        assertNotNull(directivesBuilder.build());
    }

    @Test
    public void buildNullArgumentTest() {
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(null, null);
        assertNotNull(directivesBuilder.build());
    }

}