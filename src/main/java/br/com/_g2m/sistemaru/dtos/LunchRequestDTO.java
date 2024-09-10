package br.com._g2m.sistemaru.dtos;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.Date;

public record LunchRequestDTO(Date alm_almoco; LocalTime alm_hora;BigDecimal alm_valor_Bruto) {
}
