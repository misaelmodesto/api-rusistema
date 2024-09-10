package br.com._g2m.sistemaru.entity;

import br.com._g2m.sistemaru.dtos.StudentRequestDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "students")
@Table(name = "tbl_aluno")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "pk_id_aluno")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pk_id_aluno;

    private String alu_nome;

    private String alu_matricula;

    private String alu_perfil;

    private String alu_unidade;

    private String alu_status;

    public Student (StudentRequestDTO data){
        this.alu_nome = data.alu_nome();
        this.alu_matricula = data.alu_matricula();
        this.alu_perfil = data.alu_perfil();
        this.alu_unidade = data.alu_unidade();
        this.alu_status = data.alu_status();
    }
}
