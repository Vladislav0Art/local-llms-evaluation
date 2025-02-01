package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLArgument;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Collections;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedBuildTooMuchArgumentsTest {

    @Test
    public void buildTooMuchArgumentsTest() {
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);
        Annotation annotation = mock(Annotation.class);
        GraphQLDirective directive = mock(GraphQLDirective.class);
        when(directive.getArguments()).thenReturn(Collections.emptyList());

        DirectivesBuilder directivesBuilder = new DirectivesBuilder(annotation, container);
        directivesBuilder.transformArgs(directive, new String[]{"arg1", "arg2"});
    }

}