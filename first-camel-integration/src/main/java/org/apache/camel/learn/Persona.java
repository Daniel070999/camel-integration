package org.apache.camel.learn;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = ",")
public class Persona {
    @DataField(pos = 1)
    private String nombres;
    @DataField(pos = 2)
    private String correo;
    @DataField(pos = 3)
    private String cedula;

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombres='" + nombres + '\'' +
                ", correo='" + correo + '\'' +
                ", cedula='" + cedula + '\'' +
                '}';
    }
}
