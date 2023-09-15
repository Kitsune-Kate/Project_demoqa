package dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserData {
    private String fullName;
    private String email;
    private String currentAddress;
    private String permanentAddress;


}
