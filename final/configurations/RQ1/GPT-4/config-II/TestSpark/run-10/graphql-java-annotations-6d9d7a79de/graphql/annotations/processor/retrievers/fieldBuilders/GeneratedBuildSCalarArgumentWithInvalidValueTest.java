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

public class GeneratedBuildSCalarArgumentWithInvalidValueTest {

    @Test
    public void buildSCalarArgumentWithInvalidValueTest() throws Exception {
        GraphQLArgument arg = mock(GraphQLArgument.class);
        GraphQLScalarType scalarType = Mockito.mock(GraphQLScalarType.class);
        when(arg.getType()).thenReturn(scalarType);
        when(scalarType.getCoercing().parseValue(any())).thenThrow(GraphQLAnnotationsException.class);

        DirectivesBuilder directivesBuilder = Mockito.mock(DirectivesBuilder.class);
        directivesBuilder.transformArgument(new String[]{"arg1"}, GraphQLDirective.newDirective().build().getBuilder(), Collections.singletonList(arg), 0);
    }

}