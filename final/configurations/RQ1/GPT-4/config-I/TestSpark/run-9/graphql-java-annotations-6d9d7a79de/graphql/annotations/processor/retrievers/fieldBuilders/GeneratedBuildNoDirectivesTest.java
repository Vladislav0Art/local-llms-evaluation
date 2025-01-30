package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static graphql.schema.GraphQLDirective.newDirective;

public class GeneratedBuildNoDirectivesTest {

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void buildNoDirectivesTest() {
        AnnotatedElement mockAnnotatedElement = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer mockContainer = Mockito.mock(ProcessingElementsContainer.class);
        Mockito.when(mockContainer.getDirectiveRegistry()).thenReturn(Collections.emptyMap());

        DirectivesBuilder builder = new DirectivesBuilder(mockAnnotatedElement, mockContainer);

        GraphQLDirective[] directives = builder.build();
        Assert.assertEquals(0, directives.length);
    }

}