package com.tcs.crudtickets.model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ticket {

    private long id;
    private String asunto;
    private Date fechaGenerada;
    private String descripcion;
    private String estado;
    private String prioridad;
    private String servicio;
    private String usuario;

}
