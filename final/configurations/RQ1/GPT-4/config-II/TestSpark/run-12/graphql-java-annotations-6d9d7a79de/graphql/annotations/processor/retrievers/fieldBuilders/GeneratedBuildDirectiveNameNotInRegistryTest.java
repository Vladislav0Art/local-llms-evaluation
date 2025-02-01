package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.annotationTypes.directives.activation.Directive;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBuildDirectiveNameNotInRegistryTest {

    @Test
    public void buildDirectiveNameNotInRegistryTest() {
        DummyClassWithDirective dummyClassWithDirective = new DummyClassWithDirective();
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(dummyClassWithDirective.getClass(), container);

        directivesBuilder.build();
    }

}