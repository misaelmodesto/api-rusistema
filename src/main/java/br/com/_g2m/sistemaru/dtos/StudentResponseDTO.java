package br.com._g2m.sistemaru.dtos;

import br.com._g2m.sistemaru.entity.Student;

public record StudentResponseDTO(long pk_id_aluno, String alu_nome, String alu_matricula, String alu_perfil, String alu_unidade, String alu_status) {
    
    public StudentResponseDTO(Student student){
        this(student.getPk_id_aluno(), student.getAlu_nome(), student.getAlu_matricula(), student.getAlu_perfil(), student.getAlu_unidade(), student.getAlu_status());
    }
}
