package com.cognizant.tddlearn.service;

import com.cognizant.tddlearn.repository.BookRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class BookServiceTest {

    @Test
    void testMockingAndStubbing() {

        // Create Mock Object
        BookRepository repository = mock(BookRepository.class);

        // Stub Behaviour
        when(repository.findBookById(1))
                .thenReturn("Clean Code");

        // Inject Mock
        BookService service =
                new BookService(repository);

        // Call Service
        String title =
                service.getBookTitle(1);

        // Verify Result
        assertEquals("Clean Code", title);

        // Verify Interaction
        verify(repository).findBookById(1);
    }
}