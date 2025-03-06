package at.ribinin.dto;

import lombok.Data;

@Data
public class LoginRequestDto {
    private String username; // Email or just the part before @
    private String password;
    private Boolean simulate;
}
