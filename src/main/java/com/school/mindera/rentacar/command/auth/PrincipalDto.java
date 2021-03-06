package com.school.mindera.rentacar.command.auth;

import com.school.mindera.rentacar.enumerators.UserRole;
import lombok.Builder;
import lombok.Data;

/**
 * Principal information
 * principal definition - entity who can authenticate (user, other service, third-parties...)
 */
@Data
@Builder
public class PrincipalDto {
    private Long userId;
    private String firstName;
    private UserRole userRole;
}
