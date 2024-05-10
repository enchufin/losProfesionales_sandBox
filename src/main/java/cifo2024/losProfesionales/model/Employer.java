package cifo2024.losProfesionales.model;

import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Employer {
    //propiedades del Usuario
    @Id
    private String id;
    private long dischargeDate;
    private String name;
    private String email;
    private String password;
    //propiedades del Empleador
    private String dniNif; // posible ID?
    private String companyName;
    private String cif;
}
