package br.com._g2m.sistemaru.entity;

import br.com._g2m.sistemaru.dtos.StudentRequestDTO;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.Date;

@Entity(name = "lunch")
@Table(name = "tbl_almoco")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "pk_id_almoco")

public class Lunch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pk_id_almoco;

    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date alm_data;

    private LocalTime alm_hora;

    @NumberFormat(pattern = "#,###.00")
    @Column(columnDefinition = "decimal(10,2)")
    private BigDecimal alm_valor_Bruto;

    @NumberFormat(pattern = "#,###.00")
    @Column(columnDefinition = "decimal(10,2)")
    private BigDecimal alm_valor_Liquido;

    private String alm_descnoto;

    private String alm_formpagamento;

    private String alm_refeicao;

    @NumberFormat(pattern = "#,###.00")
    @Column(columnDefinition = "decimal(7,3)")
    private BigDecimal alm_kg;

    private int fk_operador;

    private int fk_aluno;

    public Lunch (LunchRequestDTO data){
        this.alu_nome = data.alu_nome();
        this.alu_matricula = data.alu_matricula();
        this.alu_perfil = data.alu_perfil();
        this.alu_unidade = data.alu_unidade();
        this.alu_status = data.alu_status();
    }







}
