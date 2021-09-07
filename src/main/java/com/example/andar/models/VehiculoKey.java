package com.example.andar.models;

import java.io.Serializable;

/**
 * SEE https://stackoverflow.com/questions/51423268/spring-jpa-entity-with-two-primary-key
 * Class used to implement multiple @Id columns.
 */
public class VehiculoKey implements Serializable {
    private Long placa;
    private Long categoria_Id;
    private Long usuario_Id;
}