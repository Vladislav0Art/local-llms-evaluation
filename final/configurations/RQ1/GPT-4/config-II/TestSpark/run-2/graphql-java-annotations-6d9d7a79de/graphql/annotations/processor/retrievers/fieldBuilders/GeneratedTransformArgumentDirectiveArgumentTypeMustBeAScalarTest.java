package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.*;
import graphql.schema.GraphQLDirectiveContainer.Builder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.ArgumentMatchers;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;

import java.lang.reflect.Method;
import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTransformArgumentDirectiveArgumentTypeMustBeAScalarTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void transformArgumentDirectiveArgumentTypeMustBeAScalarTest() throws Exception {
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        GraphQLDirective graphQLDirective = mock(GraphQLDirective.class);
        Builder directiveBuilder = mock(Builder.class);
        List<GraphQLArgument> arguments = new ArrayList<>();
        GraphQLArgument argument = mock(GraphQLArgument.class);
        arguments.add(argument);
        int i = 0;
        Annotation annotation = mock(Annotation.class);
        Class<?> fakeClass = mock(Class.class);
        Method[] methods = new Method[]{mock(Method.class)};
        when(fakeClass.getDeclaredMethods()).thenReturn(methods);
        when(annotation.annotationType()).thenReturn(fakeClass);

        when(argument.getType()).thenReturn(mock(GraphQLType.class));

        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);

        thrown.expect(GraphQLAnnotationsException.class);
        thrown.expectMessage(DirectivesBuilder.DIRECTIVE_ARGUMENT_TYPE_MUST_BE_A_SCALAR);

        directivesBuilder.transformArgument(annotation, directiveBuilder, arguments, i);
    }

}