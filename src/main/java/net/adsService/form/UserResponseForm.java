package net.adsService.form;

import lombok.*;
import org.springframework.validation.FieldError;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponseForm {

    private List<FieldError> errors;

    private boolean success;

    private String message;
}
