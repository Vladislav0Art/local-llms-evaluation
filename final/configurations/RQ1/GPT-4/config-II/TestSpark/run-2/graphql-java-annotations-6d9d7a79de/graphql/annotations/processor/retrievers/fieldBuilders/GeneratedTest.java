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

public class GeneratedTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void buildDirectiveNotFoundErrorTest() {
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        Annotation annotation = mock(Annotation.class);
        when(DirectiveJavaAnnotationUtil.getDirectiveAnnotations(object)).thenReturn(Collections.singletonList(annotation));

        String name = "fakeName";
        when(DirectiveJavaAnnotationUtil.getName(annotation)).thenReturn(name);

        when(container.getDirectiveRegistry().containsKey(name)).thenReturn(false);

        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        thrown.expect(GraphQLAnnotationsException.class);
        thrown.expectMessage(String.format(DirectivesBuilder.NOT_FOUND_IN_DIRECTIVE_REGISTRY_ERROR, name));
        directivesBuilder.build();
    }

    @Test
    public void buildTooMuchArgumentsErrorTest() throws Exception {
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        Annotation annotation = mock(Annotation.class);
        when(DirectiveJavaAnnotationUtil.getDirectiveAnnotations(object)).thenReturn(Arrays.asList(annotation));

        Class<?> fakeClass = mock(Class.class);
        Method[] methods = new Method[]{mock(Method.class), mock(Method.class), mock(Method.class)};
        when(fakeClass.getDeclaredMethods()).thenReturn(methods);
        when(annotation.annotationType()).thenReturn(fakeClass);

        String name = "fakeName";
        when(DirectiveJavaAnnotationUtil.getName(annotation)).thenReturn(name);

        GraphQLDirective graphQLDirective = mock(GraphQLDirective.class);

        when(container.getDirectiveRegistry().containsKey(name)).thenReturn(true);

        when(container.getDirectiveRegistry().get(name).getDirective()).thenReturn(graphQLDirective);

        List<GraphQLArgument> arguments = Arrays.asList(mock(GraphQLArgument.class), mock(GraphQLArgument.class));
        when(graphQLDirective.getArguments()).thenReturn(arguments);

        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);

        thrown.expect(GraphQLAnnotationsException.class);
        thrown.expectMessage(String.format(DirectivesBuilder.TOO_MUCH_ARGUMENTS_ERROR, graphQLDirective.getName()));

        directivesBuilder.build();
    }

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

    @Test
    public void transformArgumentCouldNotParseArgumentValueToArgumentTypeTest() throws Exception {
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

        when(argument.getType()).thenReturn(mock(GraphQLScalarType.class));

        GraphQLScalarType scalarType = mock(GraphQLScalarType.class);
        when(argument.getType()).thenReturn(scalarType);

        Coercing coercing = mock(Coercing.class);
        when(scalarType.getCoercing()).thenReturn(coercing);

        Object value = mock(Object.class);
        when(methods[i].invoke(annotation)).thenReturn(value);

        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);

        when(coercing.parseValue(value)).thenThrow(new Exception());

        thrown.expect(GraphQLAnnotationsException.class);
        thrown.expectMessage(DirectivesBuilder.COULD_NOT_PARSE_ARGUMENT_VALUE_TO_ARGUMENT_TYPE);

        directivesBuilder.transformArgument(annotation, directiveBuilder, arguments, i);
    }

}