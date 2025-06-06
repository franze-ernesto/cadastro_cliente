package br.com.projeto.bankpopular.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "lojistas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lojista extends Usuario{

    private String razaoSocial;
    private String cnpj;

}

