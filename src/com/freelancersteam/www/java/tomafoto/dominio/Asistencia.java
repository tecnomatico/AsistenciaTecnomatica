package com.freelancersteam.www.java.tomafoto.dominio;
// Generated 04-may-2013 9:13:04 by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Asistencia generated by hbm2java
 */
public class Asistencia  implements java.io.Serializable {


     private Integer idAsistencia;
     private Empleado empleado;
     private String estado;
     private byte[] imagen;
     private Date fecha;
     private Date hora;
     private Boolean modificado;
     private Date fechaModificado;
     private Boolean correcto;
     private String observacion;
     private Boolean reajuste;

    public Asistencia() {
    }

    public Asistencia(Empleado empleado, String estado, byte[] imagen, Date fecha, Date hora, Boolean modificado, Date fechaModificado, Boolean correcto, String observacion, Boolean reajuste) {
       this.empleado = empleado;
       this.estado = estado;
       this.imagen = imagen;
       this.fecha = fecha;
       this.hora = hora;
       this.modificado = modificado;
       this.fechaModificado = fechaModificado;
       this.correcto = correcto;
       this.observacion = observacion;
       this.reajuste = reajuste;
    }
   
    public Integer getIdAsistencia() {
        return this.idAsistencia;
    }
    
    public void setIdAsistencia(Integer idAsistencia) {
        this.idAsistencia = idAsistencia;
    }
    public Empleado getEmpleado() {
        return this.empleado;
    }
    
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public byte[] getImagen() {
        return this.imagen;
    }
    
    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Date getHora() {
        return this.hora;
    }
    
    public void setHora(Date hora) {
        this.hora = hora;
    }
    public Boolean getModificado() {
        return this.modificado;
    }
    
    public void setModificado(Boolean modificado) {
        this.modificado = modificado;
    }
    public Date getFechaModificado() {
        return this.fechaModificado;
    }
    
    public void setFechaModificado(Date fechaModificado) {
        this.fechaModificado = fechaModificado;
    }
    public Boolean getCorrecto() {
        return this.correcto;
    }
    
    public void setCorrecto(Boolean correcto) {
        this.correcto = correcto;
    }
    public String getObservacion() {
        return this.observacion;
    }
    
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    public Boolean getReajuste() {
        return this.reajuste;
    }
    
    public void setReajuste(Boolean reajuste) {
        this.reajuste = reajuste;
    }




}


