package com.meli.obterdiploma.exeption;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ValidationExceptionDetails {
    private String title;
    private String message;
    private String fields;
    private String fieldsMessages;
    private LocalDateTime timestamp;
}
