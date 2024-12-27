package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilderFactory;
import graphql.annotations.processor.retrievers.fieldBuilders.ProcessingElementsContainer;
import graphql.annotations.processor.retrievers.fieldBuilders.AnnotatedElement;
import graphql.annotations.processor.retrievers.fieldBuilders.GraphQLDirective;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuild_BuildsDirectives_WithNullAnnotatedElement_ThrowsNullPointerException {

    @InjectMocks
    private DirectivesBuilder directivesBuilder;

    @Mock
    private AnnotatedElement annotatedElement;

    @Mock
    private ProcessingElementsContainer processingElementsContainer;

    @Test
    public void build_BuildsDirectives_WithNullAnnotatedElement_ThrowsNullPointerException() {
        // Arrange
        when(annotatedElement.getDirectives()).thenThrow(NullPointerException.class);

        // Act and Assert
        try {
            directivesBuilder.build();
            assert false;
        } catch (NullPointerException e) {
            assertNotNull(e);
        }
    }

}