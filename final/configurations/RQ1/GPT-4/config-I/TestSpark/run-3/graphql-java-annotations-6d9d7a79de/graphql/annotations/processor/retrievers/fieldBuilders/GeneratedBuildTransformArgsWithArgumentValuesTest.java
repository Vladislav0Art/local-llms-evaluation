package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;
import graphql.schema.GraphQLScalarType.DirectiveContainer;
import graphql.schema.GraphQLScalarType.GraphQLArgumentContainer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.ArrayList;

import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildTransformArgsWithArgumentValuesTest {

    @Mock
    private ProcessingElementsContainer mockedContainer;
    @Mock
    private AnnotatedElement mockedAnnotatedElement;
    @Mock
    private GraphQLDirective mockedDirective;
    @Mock
    private GraphQLDirectives mockedAnnotation;

    @Test
    public void buildTransformArgsWithArgumentValuesTest() {
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(mockedAnnotatedElement, mockedContainer);
        List<GraphQLArgument> argumentList = new ArrayList<>();
        argumentList.add(GraphQLArgument.newArgument().type(GraphQLScalarType.newScalar().name("typeName").build()).name("argumentName").build());

        when(mockedDirective.getArguments()).thenReturn(argumentList);

        assertEquals(mockedDirective.getName(), directivesBuilder.transformArgs(mockedDirective, new String[]{"argumentValue"}).getName());
    }

}