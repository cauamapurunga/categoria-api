package com.demo.categoria_api.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaDTO {
    private Long id;
    @NotNull(message = "O nome da categoria não pode ser nulo")
    private String nome;
    private String descricao;
}