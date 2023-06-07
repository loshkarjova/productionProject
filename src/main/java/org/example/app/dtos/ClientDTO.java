package org.example.app.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ClientDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String phone;
}
