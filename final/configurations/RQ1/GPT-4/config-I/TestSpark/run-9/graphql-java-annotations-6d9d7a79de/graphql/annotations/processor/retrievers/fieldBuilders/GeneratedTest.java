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

public class GeneratedTest {

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

    @Test
    public void buildNotFoundInDirectiveRegistryErrorTest() {
        ProcessingElementsContainer mockContainer = Mockito.mock(ProcessingElementsContainer.class);
        Mockito.when(mockContainer.getDirectiveRegistry()).thenReturn(new HashMap<>());

        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);

        Annotation annotation = new MyDirective();
        Mockito.when(object.getAnnotations()).thenReturn(new Annotation[]{annotation});

        DirectivesBuilder builder = new DirectivesBuilder(object, mockContainer);
        builder.build();
    }

    @Test
    public void buildTooMuchArgumentsErrorTest() {
        Annotation annotation = new MyDirective();
        Method[] methods = annotation.getClass().getDeclaredMethods();

        List<GraphQLArgument> argumentList = new ArrayList<>();
        argumentList.add(Mockito.mock(GraphQLArgument.class));

        GraphQLDirective directive = Mockito.mock(GraphQLDirective.class);
        Mockito.when(directive.getArguments()).thenReturn(argumentList);

        DirectivesBuilder builder = new DirectivesBuilder(Mockito.mock(AnnotatedElement.class), Mockito.mock(ProcessingElementsContainer.class));
        builder.transformArgs(directive, annotation);
    }

    @Test
    public void transformArgsDirectiveArgumentTypeMustBeAScalarTest() {
        GraphQLArgument argument = Mockito.mock(GraphQLArgument.class);
        Mockito.when(argument.getType()).thenReturn(Mockito.mock(GraphQLType.class));

        GraphQLDirective directive = Mockito.mock(GraphQLDirective.class);
        Mockito.when(directive.getArguments()).thenReturn(Collections.singletonList(argument));

        DirectivesBuilder builder = new DirectivesBuilder(Mockito.mock(AnnotatedElement.class), Mockito.mock(ProcessingElementsContainer.class));
        builder.transformArgs(directive, new String[]{});
    }

    @Test
    public void buildCouldNotParseArgumentValueToArgumentTypeTest() throws Exception {
        GraphQLArgument argument = mockGraphQLArgument(new IOException());

        AnnotatedElement annotatedElement = Mockito.mock(AnnotatedElement.class);
        Annotation annotation = mockAnnotation(annotatedElement);

        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        GraphQLDirective directive = mockGraphQLDirective(container, argument);

        DirectivesBuilder builder = new DirectivesBuilder(annotatedElement, container);
        builder.transformArgs(directive, annotation);
    }

    private GraphQLArgument mockGraphQLArgument(Exception exception) throws IllegalAccessException {
        GraphQLScalarType type = Mockito.mock(GraphQLScalarType.class);
        Mockito.when(type.getCoercing().parseValue(Mockito.any())).thenThrow(exception);

        GraphQLArgument argument = Mockito.mock(GraphQLArgument.class);
        Mockito.when(argument.getType()).thenReturn(type);
        return argument;
    }

    private Annotation mockAnnotation(AnnotatedElement annotatedElement) throws IllegalAccessException, InvocationTargetException {
        Annotation annotation = new MyDirective();
        Method method = Mockito.mock(Method.class);
        Mockito.when(method.invoke(Mockito.any())).thenReturn("value");
        Mockito.when(annotatedElement.getAnnotation(MyDirective.class)).thenReturn(annotation);
        return annotation;
    }

    private GraphQLDirective mockGraphQLDirective(ProcessingElementsContainer container, GraphQLArgument argument) {
        List<GraphQLArgument> arguments = Collections.singletonList(argument);
        GraphQLDirective directive = Mockito.mock(GraphQLDirective.class);
        Mockito.when(directive.getArguments()).thenReturn(arguments);
        Mockito.when(container.getDirectiveRegistry()).thenReturn(Collections.singletonMap("MyDirective",
                new DirectiveWiring("MyDirective", directive)));
        return directive;
    }

    @Target({ElementType.FIELD, ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    @GraphQLDirective
    public @interface MyDirective {
    }

}