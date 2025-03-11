package jornada.milhas.api.domain;

import java.math.BigDecimal;

public class Passagem {
    private Long id;
    private TipoPassagemEnum tipo;
    private BigDecimal precoIda;
    private BigDecimal precoVolta;
    private BigDecimal taxaEmbarque;
    private Integer conexoes;
    private Integer tempoVoo;
    private Estado origem;
    private Estado destino;
    private Companhia compamhia;

}
